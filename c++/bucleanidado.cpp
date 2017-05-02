//codigo desarrollado por Hector Fierro
#include <iostream>

using namespace std;

int main(){
	
	int i,j,res;
	
	for (i = 1;i<=12;i++){
		for(j=1;j<=10;j++){
			res = i * j;
			cout << i << "*" << j << "=" << res << endl;
		}
	}

	system("pause");
	return 0;
}

