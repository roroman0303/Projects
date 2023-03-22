from sqlalchemy import create_engine, Column, Integer, String, LargeBinary
from sqlalchemy.orm import sessionmaker, declarative_base

engine = create_engine('sqlite:///sqlite3.db')
Base = declarative_base()

class Auth(Base):
    __tablename__ = 'auth'
    id = Column(Integer(), primary_key=True)
    login = Column(String(100), nullable=False)
    hash = Column(LargeBinary(500), nullable=False)

class Users(Base):
    __tablename__ = 'users'
    id = Column(Integer(), primary_key=True)
    user_id = Column(String(100), nullable=False)
    login = Column(String(100), nullable=False)

Base.metadata.create_all(engine)

Session = sessionmaker(autoflush=False, bind=engine)
session = Session()

if __name__ == '__main__':
    Base.metadata.drop_all(engine)