/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.programs;


  
public class stack {
    
    
    public static void main(String[] args){
        
      stk st=new stk(4);
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.pop();
      int[] arr=st.myarr();
        System.out.println(arr.length);
    }
    
    private static class stk {
    int size;
    int[] arr;
    int top;
  
        public stk(int size) {
            this.size=size;
            arr=new int[size];
            top=-1;
        }
        
        private boolean isempty() {
            if(top==-1){
                return true;
            }
            
            return false;
              }
        
        private boolean isoverflow() {
            if(top==size){
                return true;
            }   
            return false;
              }

        private void push(int x) {
            if(!isoverflow())
            arr[++top]=x;
            display();
              }
        
        private void pop() {
            if(!isempty())
               top--;
            else
                System.out.println("stack empty");
           // display();
              }

        private void display() {
            if(isempty())
                System.out.println("Empty stack");
            else if(isoverflow())
                System.out.println("overflow.can not insert.");
            else
                System.out.println(arr[top]);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        
        private int[] myarr(){
            return arr;
        }
        
    }
    
}
