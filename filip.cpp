#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int a,b;
    cin>>a>>b;
    int r1=0,r2=0;
    for(int i=0;i<=2;i++){
        r1+=(a%10)*pow(10,2-i);
        r2+=(b%10)*pow(10,2-i);
        a/=10;
        b/=10;        
    }
    if(r1>r2){
      cout<<r1;
    }
    else{
      cout<<r2;
    }
}