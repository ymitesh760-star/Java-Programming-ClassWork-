interface Animal{
    int i = 0;
    void sound();
}

abstract class Dog implements Animal{
    abstract void bark();
    void fun(){
        System.out.println("inside fun");
    }
}

class Dogs extends Dog{
    void bark(){
        System.out.println("bah");
    }
    public void sound(){
        System.out.println("bah bah");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.sound();
    }
}

