import sqlite3

def main():
    con = sqlite3.connect('diccionario.db')
    cursor = con.cursor()

    cursor.execute('''CREATE TABLE Palabras (id integer,palabra text) ''')
        
main()
