def main():
	num = 1
	den = 1
	suma = 0
	n = 1000000
	cont = 0;

	while (cont <= n):
		suma += num / den
		den+=2
		suma -= num / den
		den+=2
		cont +=1

	print (suma*4)
main()