// class StaticDemo {
//     int a;
//     static int b = 10;

//     StaticDemo() {
//     }

//     void fun() {
//         System.out.println(this.a);
//         System.out.println(b);
//     }

//     public static void gun() {
//         System.out.println(b);
//     }
// }


// public class Statnamedunamed {
    
// }

class Demo{
    int a, b;
    public static int x, y;
    
   
    Demo(){
        System.out.println("inside constructor");
    }

    void fun(){
        System.out.println("inside fun");
    }

     static{
        System.out.println("static state block");
        x = 10;
        y = 20;
    }
    {
        System.out.println("inside unnamed block");
        a = 50;
        b = 60;
    }
}

class Staticdemo{
    public static void main(String[] args){
        System.out.println("inside main");
        Demo obj1 = new Demo();
        obj1.fun();
    }
}