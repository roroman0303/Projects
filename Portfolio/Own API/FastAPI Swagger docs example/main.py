from fastapi import FastAPI, Form
from pydantic import BaseModel
from typing import List
import csv


# oscar - index, year, age, name, film name of an award
with open('oscar_age_male.csv', 'r', newline='') as oscar_file:
    oscar_list = [row[:-1]+[row[-1].strip()]
                  for row in csv.reader(oscar_file, delimiter=',', skipinitialspace=True)
                  if len(row) > 4][1:]
    # ['22', '1949', '41', 'Laurence Olivier', 'Hamlet']


class Oscar(BaseModel):

    index: int | None = None
    year: int | None = None
    age: int | None = None
    actor: str | None = None
    film: str | None = None

    def __init__(self, index: str | int | None = None,
                 year: str | int | None = None,
                 age: str | int | None = None,
                 actor: str | None = None,
                 film: str | None = None):
        super().__init__()
        if index is not None: self.index = int(index)
        if year is not None: self.year = int(year)
        if age is not None: self.age = int(age)
        if actor is not None: self.actor = actor
        if film is not None: self.film = film


class OscarList(BaseModel):
    oscars: List[Oscar] = []
    count: int = 0

    def add_item(self, item: list):
        self.oscars.append(Oscar(*item))
        self.count += 1


app = FastAPI()


# one argument can be taken at the time to simplify
@app.get("/oscar", response_model=OscarList)
async def get_oscar(year: int | None = None, year_until: int | None = None, year_after: int | None = None,
                    age: int | None = None, younger_than: int | None = None, older_than: int | None = None,
                    actor_name: str | None = None, index: int | None = None) -> OscarList:
    if year is not None:
        for item in oscar_list:
            if int(item[1]) == year:
                answer = OscarList()
                answer.add_item(item)
                return answer
    elif year_until is not None:
        answer = OscarList()
        for item in oscar_list:
            if int(item[1]) <= year_until:
                answer.add_item(item)
        return answer
    elif year_after is not None:
        answer = OscarList()
        for item in oscar_list:
            if int(item[1]) >= year_after:
                answer.add_item(item)
        return answer
    elif index is not None:
        for item in oscar_list:
            if int(item[0]) == index:
                answer = OscarList()
                answer.add_item(item)
                return answer
    elif age is not None:
        for item in oscar_list:
            if int(item[2]) == age:
                answer = OscarList()
                answer.add_item(item)
                return answer
    elif younger_than is not None:
        answer = OscarList()
        for item in oscar_list:
            if int(item[2]) < younger_than:
                answer.add_item(item)
        return answer
    elif older_than is not None:
        answer = OscarList()
        for item in oscar_list:
            if int(item[2]) > older_than:
                answer.add_item(item)
        return answer
    elif actor_name is not None:
        answer = OscarList()
        for item in oscar_list:
            if item[3].lower() == actor_name.lower():
                answer.add_item(item)
        return answer
    else:
        answer = OscarList()
        for item in oscar_list:
            answer.add_item(item)
        return answer


@app.put("/oscar", response_model=dict)
async def create_or_change_oscar(index: int = Form(...), year: int = Form(...),
                                 age: int = Form(...), actor_name: str = Form(...),
                                 film_name: str = Form(...)):
    for i in range(len(oscar_list)):
        if int(oscar_list[i][0]) == index:
            oscar_list[i] = [str(index), str(year), str(age), actor_name, film_name]
            return {'message': 'success'}

# /redoc to see docs