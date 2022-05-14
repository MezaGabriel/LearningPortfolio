#include<iostream>
#include<conio.h>
using namespace std;

int main(){

//int, float, boolean, string

string nombre, apellido;
int edad;

cout<<"Ingrese el nombre de la persona"<<endl;
cin>>nombre;

cout<<"Ingrese el apellido de la persona"<<endl;
cin>>apellido;

cout<<"Ingresa la edad de la persona"<<endl;
cin>>edad;

system("cls");

cout<<"La informacion introducida por el usuario fue:  "<<endl;
cout<<"Nombre;  "<<nombre<<endl;
cout<<"Apellido:  "<<apellido<<endl;
cout<<"Edad:  "<<edad<<endl;


return 0;
}