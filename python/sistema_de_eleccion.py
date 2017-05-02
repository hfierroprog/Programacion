import time,random
def sdep():
	class pokemon:
		vida = random.randint(75,100)
		dmg = random.randint(5,25)
		tipos = ['Fuego','Agua','Electricidad','Bicho']
		tipox = random.randint(0,3)
		tipo = tipos[tipox]
		nombre = ""

	x = 0
	while (x < 2):
		pokemon+x = pokemon()
		pokemon+x.vida
		pokemon+x.dmg
		pokemon+x.tipo
		pokemon+x.nombre = raw_input("Ingresa nombre a tu pokemon:")
		print ("Tu pokemon "+pokemon+str(x)+" tiene "+str(pokemon+x.vida)+
			" de vida, es de tipo "+pokemon+x.tipo+" y tiene "+str(pokemon+x.dmg)+" de dmg")
		x+=1
	




	raw_input()


sdep()



