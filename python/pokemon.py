import time

def poke():
    pikachu_vida = 100
    pikachu_ataque = 10
    ratata_vida = 100
    ratata_ataque = 5

    while True:
        if (pikachu_vida > 0 and ratata_vida > 0):
            atacar = raw_input("/atacar para atacar. ")
            if (atacar == '/atacar'):
                ratata_vida = ratata_vida - pikachu_ataque
                time.sleep(3)
                print ("La vida actual de ratata es de:"+str(ratata_vida))
                time.sleep(3)
                print ("Ratata salvaje ataca!!")
                pikachu_vida = pikachu_vida - ratata_ataque
                time.sleep(3)
                print("La vida actual de pikachu es de:"+str(pikachu_vida))


        elif (pikachu_vida <= 0):
            time.sleep(3)
            print("Pikachu se debilita!!")
            time.sleep(3)
            print("Ratata salvaje gana la pelea!!")
            time.sleep(3)
            print ("Fin")

        elif (ratata_vida <= 0):
            time.sleep(3)
            print("Ratata se debilita!!")
            time.sleep(3)
            print("Pikachu gana la pelea!!")
            time.sleep(3)
            print("Fin")













        
