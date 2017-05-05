def main():
    file = open("dic.txt", "r")
    file2 = open("dic2.txt", "w")
    for line in file:
        line = line.split("/")[0]
        file2.write(line+"\n")
main()
