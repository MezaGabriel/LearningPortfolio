#include <iostream>
#include <conio.h>
using namespace std;

int main(){

    int opcion;
    float area, base, altura;

    cout<<"**************************"<<endl;
    cout<<"Calculadora Trigonometrica"<<endl;
    cout<<"Triangulo              (1)"<<endl;
    cout<<"Cuadrado               (2)"<<endl;
    cout<<"Rectangulo             (3)"<<endl;
    cout<<"Circulo                (4)"<<endl;
    cout<<"**************************"<<endl;

    cin>>opcion;
    while(opcion < 1 or opcion > 4){
        cout<<"Ingresa una opcion correcta"<<endl;
        cin>>opcion;
    }
    
    switch (opcion){
        case 1:
            cout<<"Digite la base del triangulo"<<endl;
            cin>>base;
            cout<<"Digite la altura del trianglo"<<endl;
            cin>>altura;
            area = (base * altura)/2;
            cout<<"El area es  "<<area;
        break;
        case 2:

        break;
        case 3:

        break;
        case 4:

        break;
    }
    
    getch();
    return 0;
}