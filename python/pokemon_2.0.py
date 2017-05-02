import time,random,os

def pokemon():
    class pokemon:
        vida = 0
        ataque = 0


    pikachu = pokemon()
    pikachu.vida = 100
    pikachu.ataque = random.randint(10,25)

    squirtle = pokemon()
    squirtle.vida = 100
    squirtle.ataque = random.randint(10,25)
    combate(pikachu.vida,pikachu.ataque,squirtle.vida,squirtle.ataque)



def combate(p_vida,p_ataque,s_vida,s_ataque):
    print(">>>Inicializando Sistema de combate...")
    time.sleep(3)
    print(">>>Pikachu vs Squirtle")
    while (p_vida > 0 and s_vida > 0):
        p_ataque = random.randint(0,25)
        s_ataque = random.randint(0,25)
        print (">>>Pikachu ataca y logra causar "+str(p_ataque)+" puntos de ataque a Squirtle")
        time.sleep(3)
        s_vida = s_vida - p_ataque
        print(">>>La vida actual de Squirtle es de:"+str(s_vida))
        time.sleep(3)
        if (p_vida > 0 and s_vida > 0):
            print(">>>Squirtle ataca y logra causar "+str(s_ataque)+" puntos de ataque a Pikachu")
            time.sleep(3)
            p_vida = p_vida - s_ataque
            print(">>>La vida actual de Pikachu es de:"+str(p_vida))

        if (p_vida <= 0):
            time.sleep(3)
            print(">>>Pikachu se ha debilitado")
            time.sleep(3)
            print(">>>Squirtle gana la batalla")
            time.sleep(2)
            print(">>>Fin")
                

        elif (s_vida <= 0):
            time.sleep(3)
            print(">>>Squirtle se ha debilitado")
            time.sleep(3)
            print(">>>Pikachu gana la batalla")
            time.sleep(2)
            print(">>>Fin")
pokemon()








            
        



    
