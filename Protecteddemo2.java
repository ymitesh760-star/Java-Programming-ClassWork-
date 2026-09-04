class Parent{
    protected int a = 10;
    protected int b = 20;

    void display(){
        System.out.println(a);
        System.out.println(b);

    }
}

class Child extends Parent{
    void childdisplay(){
        System.out.println(a);
        System.out.println(b);
    }
}

class Protecteddemo2{
    public static void main(String [] args){
        Parent obj1 = new Parent();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj1.display();
    }
}