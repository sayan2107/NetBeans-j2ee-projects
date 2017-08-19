#include <iostream>
#include <string>

using namespace std;

class human{
public:
    static int humancount;

    human(){
        humancount++;
    }


  //  void humantotal(){
   // cout<<"there are "<<humancount<<" peoples are here"<<endl;

    //}

    static void humancount(){
     cout<<"there are "<<humancount<<" peoples are here"<<endl;

    }
};

int human :: humancount=0;

int main()
{
 human sayan;
 human subho;
 human deb;
 human :: humancount();
 return 0;
}

