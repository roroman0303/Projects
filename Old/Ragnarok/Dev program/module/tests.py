import Ragnarok.module.test_roeu_luckybox as test_roeu_luckybox
import Ragnarok.module.test_ropeu_luckybox as test_ropeu_luckybox
import Ragnarok.module.test_ropru_luckybox as test_ropru_luckybox
import Ragnarok.module.test_ropru_shop as test_ropru_shop
import Ragnarok.module.test_ropeu_shop as test_ropeu_shop
import Ragnarok.module.test_roeu_shop as test_roeu_shop

def shop(region):
    if region == 'ropru': test_ropru_shop.all()
    elif region == 'ropeu': test_ropeu_shop.all()
    elif region == 'roeu': test_roeu_shop.all()

def luckybox(region):
    if region == 'ropru': test_ropru_luckybox.all()
    elif region == 'ropeu': test_ropeu_luckybox.all()
    elif region == 'roeu': test_roeu_luckybox.all()


