
#include <cstdlib>
#include <stdio.h>
#include <iostream>
#include <string>

//function declaration 

using namespace std;



int main() {
    
 char stk[50],exp[100];
 int top=-1;
 cout<<"Enter your expression:"<<endl;
 fgets(exp,100, ((__getreent()) ->_stdin));
 
 for(int i=0;i<=100;i++){
     if(exp[i]=='{' || exp[i]=='(' || exp[i]=='['){
         stk[top++]==exp[i];
         cout<<stk;
        
     }else if(exp[i]==')'){
         if(stk[top]=='(')
           top--;
         
     }else if(exp[i]=='}'){
         if(stk[top]=='{')
         top--;
        
     }else if(exp[i]==']'){
         if(stk[top]=='[')
         top--;
        
     }else exit(0);
     
        
 }
 

 
 if(top == -1)
     cout<<"balanced exp"<<endl;
 else
     cout<<"not balanced exp"<<endl;
    return (0);
}






