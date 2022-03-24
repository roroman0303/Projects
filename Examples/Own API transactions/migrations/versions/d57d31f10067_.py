"""empty message

Revision ID: d57d31f10067
Revises: 
Create Date: 2022-03-24 18:19:36.388279

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = 'd57d31f10067'
down_revision = None
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.create_table('balance',
    sa.Column('id', sa.Integer(), autoincrement=True, nullable=False),
    sa.Column('client_key', sa.String(length=80), nullable=False),
    sa.Column('balance', sa.Float(precision=2), nullable=False),
    sa.Column('update', sa.Integer(), nullable=False),
    sa.PrimaryKeyConstraint('id'),
    sa.UniqueConstraint('client_key'),
    sa.UniqueConstraint('id')
    )
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_table('balance')
    # ### end Alembic commands ###
