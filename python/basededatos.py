import MySQLdb

def main():
	##conectamos a la base de datos##
	db = MySQLdb.connect("127.0.0.1","root","root","test")
	##Creamos un cursor##
	cursor = db.cursor()

	##Generamos una consulta##
	sql = "select * from usuarios"

	##ejecutamos la consulta##
	cursor.execute(sql)

	##obtenemos los datos##
	resultados = cursor.fetchall()

	for registro in resultados:
		id_user = registro[0]
		nick = registro[1]
		email = registro[2]
		edad = registro[3]


		##Imprimimos los resultados en pantalla##
		print str(id_user)+" , "+nick+" , "+email+" , "+str(edad)

	db.close() 
main()