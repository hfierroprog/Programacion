//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int cambiar_valor(int&);

int main(){
	int x=10;
	
	cout <<"Valor de x: " << x << endl;
	cambiar_valor(x);
	cout <<"Nuevo valor de x: " << x << endl;
	
	system("pause");
	return 0;
}

int cambiar_valor(int& x){
	x+=1;
	return x;
}
