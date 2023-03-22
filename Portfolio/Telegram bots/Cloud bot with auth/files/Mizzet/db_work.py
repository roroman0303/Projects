import db
import bcrypt


def check(user_id):
    user = db.session.query(db.Users).filter(db.Users.user_id == user_id).first()
    if user: return user.login
    else: return user


def register(user_id, data):
    password = data['password']
    byte_password = password.encode('utf-8')
    salt = bcrypt.gensalt()
    password_hash = bcrypt.hashpw(byte_password, salt)
    auth = db.Auth(login=data['login'], hash=password_hash)
    user = db.Users(user_id=user_id, login=data['login'])
    db.session.add(auth)
    db.session.add(user)
    db.session.commit()


def login(user_id, data):
    auth = db.session.query(db.Auth).filter(db.Auth.login == data['login']).first()
    password = data['password'].encode('utf-8')
    if bcrypt.checkpw(password, auth.hash):
        user = db.Users(user_id=user_id, login=data['login'])
        db.session.add(user)
        db.session.commit()
        return data['login']
    else: return None


def sign_out(user_id):
    user = db.session.query(db.Users).filter(db.Users.user_id == user_id).first()
    db.session.delete(user)
    db.session.commit()


if __name__ == '__main__':
    print(check('101010101010'))