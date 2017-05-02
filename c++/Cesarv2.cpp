//codigo desarrollado por Hector Fierro
#include <iostream>
#include <string>

using namespace std;


int cifrar(string &cadena, int clave);
int descifrar(string &cadena,int clave);

int main(){
	bool bucle = true;
	int opcion,clave; 
	string cadena;
	
	while(bucle){
		cout <<"Bienvenido al sistema de cifrado de Cesar" << endl;
		cout <<"1.-Cifrar una cadena\n" 
			 <<"2.-Descifrar una cadena\n"
			 <<"3.-Salir del programa\n"
			 <<"Ingresa una opcion: ";
			 
		cin >> opcion;
		
		switch(opcion){
			case 1:
				cout << "Ingrese el desplazamiento ej 3: ";
				cin >> clave;
				cin.ignore();
				cout << "Ingresa cadena a cifrar: ";
				getline (cin,cadena);
				cadena.resize(cadena.length());
				cifrar(cadena,clave);
				break;
			case 2:
				cout << "Ingrese el desplazamiento: ";
				cin >> clave;
				cin.ignore();
				cout << "Ingresa cadena a descifrar: ";
				getline (cin,cadena);
				cadena.resize(cadena.length());
				descifrar(cadena,clave);
				break;
			case 3:
				bucle = false;
				break;
		}
	}

	system("pause");
	return 0;
}


int cifrar(string &cadena,int clave){
	int i,j;
	
	for(i=0;i<cadena.length();i++){
		if(cadena[i] >= 'a' && cadena[i] <= 'z'){
				if (cadena[i] + clave > 'z'){
					cadena[i] = 'a' - 'z' + cadena[i] + clave - 1;
				}
				else if(cadena[i] + clave < 'a'){
					cadena[i] = 'z' - 'a' + cadena[i] + clave + 1;
				}
				else 
					cadena[i]+=clave;
				}
				
		else if(cadena[i] >= 'A' && cadena[i] <= 'Z'){
				if (cadena[i] + clave > 'Z'){
					cadena[i] = 'A' - 'Z' + cadena[i] + clave - 1;
				}
				else if(cadena[i] + clave < 'A'){
					cadena[i] = 'Z' - 'A' + cadena[i] + clave + 1;
				}
				else 
					cadena[i]+=clave;
				}
			}
	cout << "\n\n";
	
	cout << cadena << "\n\n";
	
	return 0;
}

int descifrar(string &cadena,int clave){
	
	cifrar(cadena,-clave);

	return 0;
}
