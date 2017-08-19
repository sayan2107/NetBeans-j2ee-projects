#include <iostream>


using namespace std;
class ope{
    ope(){
    
    }
};

int main()
{

    int top=-1,triger,x,i;
    int stk[50];
    while(1){

    cout<<"\n\n1.push"<<endl;
    cout<<"2.pop"<<endl;
    cout<<"3.display\n";
    cout<<"choose any operation --> ";
    cin>>triger;


    switch(triger){
    case 1: {
        if(top==49)
            cout<<"Stack is full"<<endl;
            else{
            cout<<"Enter a value ---> ";
            cin>>stk[++top];

            }

        break;
    }

    case 2: {
        if(top==-1)
            cout<<"\nStack is empty.Nothing to pop"<<endl;
        else{
        cout<<"\nvalue to be popped is "<<stk[top]<<endl;
        top--;

          }
        break;
    }


    case 3: {
        if(top==-1)
            cout<<"Stack is empty"<<endl;
        else{
                cout<<"------your list------\n";
        for(i=top;i>=0;i--){
                cout<<stk[i]<<endl;
            }
         }
        break;
     }
    default: cout<<"Invalid choice"<<endl;
     }

}



    return 0;
}
