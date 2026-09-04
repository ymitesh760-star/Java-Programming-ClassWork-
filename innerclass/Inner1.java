class Outer{
    int num = 10;

    class Inner{
        public int no = 20;
        void display(){
            System.out.println("Inside inner display");
            System.out.println(no);
        }
    }
}

public class Inner1{
    public static void main(String[] args){
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.display();

    }
}