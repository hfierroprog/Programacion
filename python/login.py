import MySQLdb

def main():
	db = MySQLdb.connect("127.0.0.1","root","root","login")
	
	cursor = db.cursor()

	usuario = raw_input("Ingresa el nombre de usuario: ")
	pswrd = raw_input("Ingresa la password: ")

	sql = "select * from users"
	cursor.execute(sql)
	db.commit()

	resultado = cursor.fetchall()

	for datos in resultado:
		username = datos[0]
		password = datos[1]

		if (username == usuario and password == pswrd):
			logeado(username)

	print "Error de autenticacion"
	opcion = raw_input("Deseas registrarte? S/N : ")

	if (opcion == 's' or opcion == 'S'):
		registrarse(cursor,db)

	elif (opcion == 'n' or opcion == 'N'):
		print "Fin del programa"
		exit()


def logeado(username):
	print "Bienvenido "+username 
	exit()


def registrarse(cursor,db):
	usuario = raw_input("Ingresa el nombre de usuario: ")
	password = raw_input("Ingresa una password: ")

	sql = "insert into users values('"+usuario+"','"+password+"')"

	cursor.execute(sql)
	db.commit()

	print "Cuenta registrada correctamente!"

	main()

main()