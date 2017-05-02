//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int sumar(int,int);

int main(){
	int num1,num2;
	
	cout << "Ingresa el primer numero: ";
	cin >> num1;
	cout << "Ingresa el segundo numero: ";
	cin >> num2;

	cout << "El resultado de la suma es: " << sumar(num1,num2) << endl;

	system("pause");
	return 0;
}

int sumar(int num1,int num2){
	int res;
	
	res = num1 + num2;
	
	return res;
}

