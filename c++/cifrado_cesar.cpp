//codigo desarrollado por Hector Fierro
#include <iostream>
#include <string>

using namespace std;

int main(){
	string diccionario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	string palabra = "Jqnc uqA wp vgzvq ekhtcfq";
	string palabra_cifrada;
	palabra_cifrada.resize(palabra.length());
	const int clave = 2;
	
	int i,j;
	
	for (i=0;i<palabra.length();i++){
		for(j = 0;j < diccionario.length();j++){
			if(palabra[i] == diccionario[j]){
				palabra_cifrada[i] = diccionario[j+clave];
				break;
			}
			else if(palabra_cifrada[i] == ' '){
				palabra_cifrada[i] = ' ';
			}
		}
	}

	
	cout << palabra_cifrada << endl;
	
	system("pause");
	return 0;
}

