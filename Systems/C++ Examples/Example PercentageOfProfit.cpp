#include <iostream>
using namespace std;
int calcularPrecioDeVenta(int costo, int stock);
int PorcentajeDeGanancia(int costo, int stock);
int precio_final;

int main(){

    int productos[5][4];
    int precioCompra = 0,precioVenta = 0;

    for (int i=0;i<5;i++){
    cout<<"Digite el precio del producto:  "<<i+1<<" $";
    cin>>productos[i][0];
    cout<<"Digite el stock del producto:  "<<i+1<<" ";
    cin>>productos[i][1];
    productos[i][2] = PorcentajeDeGanancia(productos[i][0], productos[i][2]);
    productos[i][3] = calcularPrecioDeVenta(productos[i][0],productos[i][2]);
    cout<<endl;
    }

    for (int i=0;i<5;i++){

    cout<<"PRODUCTO "<<i+1<<" es: "<<endl;
    cout<<"Costo          : $"<<productos[i][0]<<endl;
    cout<<"Stock          : "<<productos[i][1]<<endl;
    cout<<"Ganancia       : $"<<productos[i][2]<<endl;
    cout<<"Precio de Venta: $"<<productos[i][3]<<endl<<endl;
    }

    for (int i=0;i<5;i++){

        precioCompra = precioCompra + productos[i][0];
        precioVenta = precioVenta + productos[i][3];
    }
    cout<<"El precio total de compra de productos es: [$"<<precioCompra<<"]"<<endl;
    cout<<"El precio total de venta de productos es: [$"<<precioVenta<<"]"<<endl;
    return 0;
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
int PorcentajeDeGanancia(int costo, int stock){
    int ganancia;
    
    if ((stock >= 100 and costo <= 1500) or stock < 50){
        ganancia = 15;
        return ganancia;
    }
    else {
        ganancia = 20;
        return ganancia;
    }

}