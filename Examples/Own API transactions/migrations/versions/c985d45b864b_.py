"""empty message

Revision ID: c985d45b864b
Revises: d57d31f10067
Create Date: 2022-03-24 21:22:34.815878

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = 'c985d45b864b'
down_revision = 'd57d31f10067'
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.create_unique_constraint(None, 'balance', ['id'])
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_constraint(None, 'balance', type_='unique')
    # ### end Alembic commands ###
