class stack{
    int MAX=100;
    int[] a= new int[MAX];
    int top;
    stack(){
        top=-1;
    }

    void push(int x){
        if(top>=MAX-1){
            System.out.println("stack over flow");
        }else{
            a[++top]=x;
        }

    }

    void pop(){
        if(top== -1){
            System.out.println("no element to pop");
        }else{
            top--;
        }

    }

    int top(){
        if(top<0){
            System.out.println("stack underflow");
            return 0;
        }else {
            return a[top];
        }
    }

    boolean empty(){
        return top<0;
    }

    void print(){
        for(int i=0;i<top;i++){
            System.out.print(a[1]);

        }
    }

    public static void main(String[] args) {
        stack a=new stack();
        a.push(5);
        a.print();
        a.push(4);
        a.print();
        a.push(1);
        a.print();
        a.pop();
        a.top();
        a.print();

    }


}