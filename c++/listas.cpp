//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int main(){
	int longitud = 5;
	int lista[longitud] = {8,5,6,7,4};
	int i;
	
	for (i= 0;i<longitud;i++){
		cout << lista[i] << ",";
	}

	cout << endl;
	
	system("pause");
	return 0;
}

