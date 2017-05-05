import sqlite3

def main():
    con = sqlite3.connect('diccionario.db')
    cursor = con.cursor()

    identificador = 0;
    archivo = open("dic2.txt", "r")

    for line in archivo:
        line = line.split("\n")[0]                  
        cursor.execute("INSERT INTO Palabras (id,palabra) VALUES (?,?)", (identificador,line))
        identificador +=1


    con.commit()
main()
