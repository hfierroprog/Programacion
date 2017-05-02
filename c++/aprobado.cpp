#include <iostream>

using namespace std;

int main(){
	double nota;
	
	cout << "Ingresa la nota del alumno: "; 
	cin >> nota;
	
	if (nota >= 4.0){
		cout << "Alumno aprobado Felicidades!" << endl;
	}
	else{
		cout << "Alumno REPROBADO :( " << endl;
	}
	
	system("pause");
	return 0;
}
