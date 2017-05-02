import time,os,sys

def main():
    raw_input(">>>Pulsa enter para iniciar - Para terminar tambien")
    tiempo = 0
    while True:
        print tiempo
        time.sleep(1)
        tiempo +=1
        os.system("cls")
        if(sys.ps1):
            break
main()
