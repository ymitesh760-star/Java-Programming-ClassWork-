class static_demo {

    int a;
    static int b=10;

    void fun(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void gun(){
        // System.out.println(a);
        System.out.println(b);
    }

}

public class Main{
    public static void main(String[] args) {
        static_demo obj1 = new static_demo();
        obj1.fun();
        static_demo.gun();
        static_demo.fun();
        
    }
}