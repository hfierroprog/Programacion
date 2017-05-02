#include <iostream>

using namespace std;

int main(){
	int x = 64654;
	
	switch(x){
		case 1:
			cout << "Este es el caso 1" << endl;
			break;
		case 2:
			cout << "Este es el caso 2" << endl;
			break;
		case 3:
			cout << "Este es el caso 3" << endl;
			break;
		case 4:
			cout << "Este es el caso 4" << endl;
			break;
		default:
			cout << "Este es el caso por default" << endl;
			break;
	}
	
	system("pause");
	return 0;
}
