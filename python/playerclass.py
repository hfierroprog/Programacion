def main():
    x = 0
    string1 = "    AddPlayerClass("
    string2 = ",1958.3783,1343.1572,15.3746,270.1425,0,0,0,0,-1,-1);"

    while (x < 320):
        print (string1+str(x)+string2)
        x+=1

    raw_input()

main()
