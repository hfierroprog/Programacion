//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int main(){
	int variable = 10;
	int * puntero = &variable;
	
	cout << "*puntero tiene un valor de: " << *puntero << endl;
	cout << "puntero esta en la direccion: " << puntero << endl; 

	system("pause");
	return 0;
}

