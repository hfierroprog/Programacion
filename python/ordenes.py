import time,datetime
def main():

    condicion = True

    hoy = datetime.date.today()

    while (condicion == True):
        
    
        archivo = open(str(hoy)+" - ordenes.txt",'a')

        username = raw_input("Ingresa el nombre de usuario:")

        motivo = raw_input("Ingresa el motivo de la orden:")

        resolucion = raw_input("Ingresa la solucion del problema:")

        archivo.write(username+" - "+motivo+" - "+resolucion)

        archivo.write("\n")

        archivo.close()

        continuar = raw_input("Continuar?(s/n):")

        if (continuar == 'n'):
            condicion = False
            

main()
