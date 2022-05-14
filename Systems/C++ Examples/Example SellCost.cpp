#include <iostream>
using namespace std;
int calcularPrecioDeVenta(int costo, int stock);
int precio_final;

int main(){

    int costo,stock;

    cout<<"Digite el precio del producto:  ";
    cin>>costo;
    cout<<"Digite el stock del producto:  ";
    cin>>stock;
    cout<<"El precio final es:  ";
    cout<<calcularPrecioDeVenta(costo,stock);
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
