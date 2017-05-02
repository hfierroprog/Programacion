import os

def main():
    ip = 0
    rango = 255
    while(ip <= rango):
        os.system("ping 192.168.1."+str(ip))
        ip += 1

main()
