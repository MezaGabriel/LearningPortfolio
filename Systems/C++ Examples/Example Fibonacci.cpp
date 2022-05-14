//anotaciones                           //z=x+y
    //if condicion                      //imprimir z
    //while bucle-condicional           //x=y
    //for bucle                         //y=z
    //switch opciones

//La secuencia FIBONACCI
#include<iostream>
using namespace std;

int main(){

    int fibo,x=0,y=1,z=0;

    cout<<"Digite la cantidad de saltos de fibonacci que desea saber:  "<<endl;
    cin>>fibo;

    cout<<"[1]"<<endl;
    for (int i=0;i<fibo-1;i++){

        z = x + y;
        cout<<"["<<z<<"]"<<endl;
        x = y;
        y = z;

    }



}
