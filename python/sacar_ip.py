import os

def main():
    username = raw_input("Ingresa el nombre de usuario:")
    x = os.system("ping "+username+ "&& pause")

main()
