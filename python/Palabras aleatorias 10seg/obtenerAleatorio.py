import sqlite3,random,time,os

def main():
    os.system("cls")
    con = sqlite3.connect('diccionario.db')
    cursor = con.cursor()

    while True:
        identificador = random.randrange(68412)
        cursor.execute("SELECT palabra FROM Palabras where id="+str(identificador))
        palabra = cursor.fetchone()[0]
        print("\n\n\n\n\n\n\n")
        print(palabra.center(os.get_terminal_size().columns))
        time.sleep(10)
        os.system("cls")
main()
