#include<iostream>
using namespace std;
 void number(int n){
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            cout<<" ";
        }
        for(int j =1;j<=i;j++){
            cout<<i<<" ";
        }
        cout<<endl;
    }
 }
 int main(){
    number(5);
 }