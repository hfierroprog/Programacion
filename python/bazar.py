import MySQLdb,os

def main():
	condicion = True
	while (condicion):
		db = MySQLdb.connect("127.0.0.1","root","root","bazar")
		cursor = db.cursor()
	
		print "1.-Agregar producto"
		print "2.-Ver productos"
		print "3.-Registrar ventas"
		print "4.-Ver registro de ventas"
		print "5.-Salir"

		opcion = input("Ingresa una opcion: ")

		if (opcion == 1):
			agregar(db,cursor)
		elif (opcion == 2):
			ver(db,cursor)
		elif (opcion == 3):
			registrar(db,cursor)
		elif (opcion == 4):
			ver_registro(db,cursor)
		elif (opcion == 5):
			print "Muchas gracias por usar el sistema de bazar creado por Hector Fierro"
			MySQLdb.close(db)
			exit()
		else:
			print "Opcion no valida favor reintentar"

def agregar(db,cursor):
	nombre = raw_input("Ingresa el nombre del producto: ")
	valor = raw_input("Ingresa el valor del producto: ")

	sql = "insert into productos(nombre,valor) values('"+nombre+"',"+str(valor)+")\n\n"

	cursor.execute(sql)

	db.commit()

	os.system("cls")

	print "Producto agregado correctamente a la base de datos!\n\n"

	main()

def ver(db,cursor):
	sql = "select * from productos"

	cursor.execute(sql)

	db.commit()

	resultados = cursor.fetchall()

	for datos in resultados:
		id_producto = datos[0]
		nombre_producto = datos[1]
		valor = datos[2]


		print "ID: "+str(id_producto)+" Nombre: "+nombre_producto+" Valor: "+str(valor)

	print "\n\n\n"

	main()

def registrar(db,cursor):
	id_producto = input("Ingresa el id del producto a registrar: ")

	sql = "select nombre,valor from productos where id_producto = "+str(id_producto)
	
	cursor.execute(sql)

	resultados = cursor.fetchall()

	for datos in resultados:
		nombre = datos[0]
		valor = datos[1]


	sql = "insert into ventas (producto,valor) values('"+nombre+"',"+str(valor)+")\n\n"

	cursor.execute(sql)

	db.commit()

	os.system("cls")

	print "Venta registrada correctamente \n\n\n"

	main()

def ver_registro(db,cursor):
	sql = "select * from ventas"

	cursor.execute(sql)

	db.commit()

	resultados = cursor.fetchall()

	for datos in resultados:
		id_venta = datos[0]
		nombre = datos[1]
		valor = datos[2]

		print ("Nro.Venta: "+str(id_venta)+" producto: "+nombre+" valor: "+str(valor))


	print "\n\n\n"

	main()
main()
