#include <iostream>
#include <conio.h>
using namespace std;

int main(){

    int n;

    cout<<"Digite el numero hasta donde desee que este gran programa cuente  "<<endl;
    cin>>n;
    
    for (int i=0;i<=n;i++){
        cout<<i<<"-";
    }


    getch();
    return 0;
}    