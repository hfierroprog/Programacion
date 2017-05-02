import os

def main():
    ip = raw_input("Ingresa ip:")
    os.system("ping -t -l 15000 "+str(ip))
main()
