from pydantic import BaseModel


class Auth(BaseModel):
    email: str
    password: str


class Message(BaseModel):
    user: str
    to: str
    subject: str
    text: str


class Mail(BaseModel):
    auth: Auth
    message: Message
