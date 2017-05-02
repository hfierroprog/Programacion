//codigo desarrollado por Hector Fierro
#include <iostream>
#include <string>

using namespace std;

int main(){
	string cadena;
	int i,j;
	
	cout << "Ingresa una cadena de texto: ";
	getline(cin,cadena);
	
	cadena.resize(cadena.length());
	
	for(i=0;i<cadena.length();i++){
		while (cadena[i] >= 'a' && cadena[i] <= 'z'){
			cadena[i]=cadena[i+2];
		}
	}

	cout << cadena << endl;

	system("pause");
	return 0;
}

