#include <iostream>
using namespace std;
int calcularPrecioDeVenta(int costo, int stock);
int precio_final;

int main(){

    int costo[5],stock[5];

    for (int i=0;i<5;i++){
    cout<<"Digite el precio del producto:  "<<i+1<<" ";
    cin>>costo[i];
    cout<<"Digite el stock del producto:  "<<i+1<<" ";
    cin>>stock[i];
    cout<<"El precio final es:  ";
    cout<<calcularPrecioDeVenta(costo[i],stock[i]);
    cout<<endl;
    }

}
int calcularPrecioDeVenta(int costo,int stock){
    if ((stock >= 100 and costo <= 1500) or stock < 50){
        precio_final = (costo * 1.15) * 1.21;
        return precio_final;
    }
    else {
        precio_final = (costo * 1.20) * 1.21;
        return precio_final;
    }
    
}
