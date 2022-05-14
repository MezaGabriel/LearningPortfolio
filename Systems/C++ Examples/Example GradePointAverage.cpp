#include <iostream>
#include <conio.h>
using namespace std;

int main(){

    float nota1, nota2, nota3, nota4;

    cout<<"Digite la nota 1 ";
    cin>>nota1;
    while (nota1 < 1 or nota1 > 10){
        cout<<"La nota insertada es invalida"<<endl;
        cout<<"Inserta una nueva"<<endl;
        cin>>nota1;
    }

    cout<<"Digite la nota 2 ";
    cin>>nota2;
    while (nota2 < 1 or nota2 > 10){
        cout<<"La nota insertada es invalida"<<endl;
        cout<<"Inserta una nueva"<<endl;
        cin>>nota2;
    }

    cout<<"Digite la note 3 ";
    cin>>nota3;
    while (nota3 < 1 or nota3 > 10){
        cout<<"La nota insertada es invalida"<<endl;
        cout<<"Inserta una nueva"<<endl;
        cin>>nota3;
    }

    cout<<"Digite la nota 4 ";
    cin>>nota4;
    while (nota4 < 1 or nota4 > 10){
        cout<<"La nota insertada es invalida"<<endl;
        cout<<"Inserta una nueva"<<endl;
        cin>>nota4;
    }

    int sumatoria = nota1 + nota2 + nota3 + nota4;

    int promedio = sumatoria / 4;

    cout<<"El promedio es "<<promedio;

    if (promedio >= 5){
        cout<<" Esta APROBADO";
    }else{
        cout<<" Esta DESAPROBADO";
    }

    getch();
    return 0;
}