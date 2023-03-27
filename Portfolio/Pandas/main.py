import pandas as pd

titanic_data = pd.read_csv('titanic.csv', sep=',')

men_count = len(titanic_data[titanic_data.Sex == 'male'])
average_age_men = titanic_data[titanic_data.Sex == 'male']['Age'].mean()
print(f'Men count: {men_count}')
print(f'Average men age: {average_age_men}')

women_count = len(titanic_data[titanic_data.Sex == 'female'])
print(f'Women count: {women_count}')
average_age_women = titanic_data[titanic_data.Sex == 'female']['Age'].mean()
print(f'Average women age: {average_age_women}')

class_survive = titanic_data.groupby(['PClass', 'Survived'])['PassengerID'].count()
print(f'Survived by class: \n{class_survive}')
sex_survive = titanic_data.groupby(['Sex', 'Survived'])['PassengerID'].count()
print(f'Survived by sex: \n{sex_survive}')

titanic_data.loc[titanic_data.Age < 19, 'Adult'] = 0
titanic_data.loc[titanic_data.Age >= 19, 'Adult'] = 1

kids_count = len(titanic_data[titanic_data['Adult'] == 0])
adults_count = len(titanic_data[titanic_data['Adult'] == 1])
print(f'Kids count: {kids_count}')
print(f'Adults count: {adults_count}')
age_survive = titanic_data.groupby(['Adult', 'Survived'])['PassengerID'].count()
print(f'Survived by age: \n{age_survive}')

unknown_count = len(titanic_data[titanic_data['Age'].isnull()])
print(f'Unknown age count: {unknown_count}')
class_adult_survive = titanic_data.groupby(['PClass', 'Adult', 'Survived'], dropna=False)['PassengerID'].count()
print(f'Survived: \n{class_adult_survive}')


average_age = titanic_data['Age'].mean()
titanic_data['AgeDifference'] = titanic_data.Age.map(lambda x: x - average_age)
print(titanic_data.to_string())
