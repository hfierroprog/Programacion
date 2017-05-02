//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int main(){
int opcion;
bool cond = true;
	
while(cond){

	
	cout <<"Bienvenido a Whatsapp\n" 
		 <<"1.-Enviar Mensaje\n"
		 <<"2.-Recibir mensajes\n"
		 <<"3.-Agregar contacto\n"
		 <<"4.-Salir\n"
		 <<"Ingresa una opcion: ";
	cin >> opcion;
	
	switch(opcion){
		case 1:
			cout << "Mensaje enviado corretcamente!" << endl;
			break;
		case 2:
			cout << "Mensajes recibidos correctamente!" << endl;
			break;
		case 3:
			cout << "Contacto agregado correctamente!" << endl;
			break;
		case 4:
			cout << "Saliendo.. presiona enter" << endl;
			cond = false;
			break;
	}
}
	
system("pause");
return 0;
}

