//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int main(){
	const int longitud = 5;
	int lista[longitud] = {5,1,2,7,8};
	int i,j,aux,cont;
	
	for (i=0;i<longitud;i++){
		for (j=0;j<longitud;j++){
			if (lista[j] > lista[j+1]){
				aux = lista[j];
				lista[j] = lista[j+1];
				lista[j+1] = aux;	
			}
		}
	}
	
	
	for(cont = 0;cont<longitud;cont++){
		cout << lista[cont+1] << " ";
	}

	system("pause");
	return 0;
}

