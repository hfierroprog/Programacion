import time,random

def pokemones():
    ###ATRIBUTOS BASICOS DE UN POKEMON###
    class pokemon:
        vida = 0
        dmg = 0
        nombre = ""

    ###SE CREAN POKEMONES###
    pokemon1 = pokemon()
    pokemon1.vida = 100
    pokemon1.dmg = 0
    pokemon1.nombre = "Pikachu"

    pokemon2 = pokemon()
    pokemon2.vida = 100
    pokemon2.dmg = 0
    pokemon2.nombre = "Bulbasaur"

    pokemon3 = pokemon()
    pokemon3.vida = 100
    pokemon3.dmg = 0
    pokemon3.nombre = "Squirtle"

    pokemon4 = pokemon()
    pokemon4.vida = 100
    pokemon4.dmg = 0
    pokemon4.nombre = "Charmander"

    tupla = [pokemon1.nombre,pokemon2.nombre,pokemon3.nombre,pokemon4.nombre]

    poke1 = raw_input("Ingresa el pokemon que va a pelear:")

    x = 0

    for poke1 in tupla[x]:
        if poke1 != tupla
        x *=1

    print tupla[x]
        
    

pokemones()

