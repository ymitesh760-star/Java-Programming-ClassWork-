class Base {
    void fun() {
        System.out.println("Inside fun");
    }
}

class Derived extends Base {
    void gun() {
        System.out.println("Inside gun");
    }
}


class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inside main");

        Base obj1 = new Base();
        obj1.fun();
        // obj1.gun();

        Derived obj2 = new Derived();
        obj2.gun();
        obj2.fun();
        
    }
}

