//VECTOR
#include<iostream>
using namespace std;

int main(){

    int x;
    string nombre[x];
    int edades[x];

    cout<<"Ingrese el valor que van a tener los vectores:  "<<endl;
    cin>>x;

system("cls");

    for (int i=0;i<x;i++){
        cout<<"Ingrese el nombre que desea guardar en la posicion: "<<i+1<<" ";
        cin>>nombre[i];
        cout<<"Ingrese la edad que desea guardar en la posicion: "<<i+1<<" ";
        cin>>edades[i];
        system("cls");
    }    

    system("cls");

    cout<<"El vector que poblaste fue este: "<<endl;
    for (int i=0;i<x;i++){
        cout<<nombre[i]<<" "<<edades[i]<<endl;
    }
}