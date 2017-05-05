import sqlite3

def main():
    con = sqlite3.connect('diccionario.db')
    cursor = con.cursor()

    for fila in cursor.execute("SELECT * FROM Palabras"):
        print(fila)
main()
