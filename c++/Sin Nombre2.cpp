
#include <iostream> 
 
using namespace std; 
 
void medioTrngl ( int numeroNiveles ){ 
 
    for ( int i =  0 ; i < numeroNiveles ; i ++ ){ 
        cout<<endl; 
        for ( int j = 1 ; j <=  i ; j ++  ) 
            cout << '*'; 
    } 
} 
 
    int main () 
    { 
 
        /* solo para numeros enteros */ 
        int numeroNiveles; 
        cin>>numeroNiveles; 
 
        if (numeroNiveles > 0) 
            medioTrngl(numeroNiveles); 
 
 
        return 0; 
 
    } 
