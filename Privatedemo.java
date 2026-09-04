class Privdemo{
    private int a = 10;

    void display(){
        System.out.println(a);
    }
}

class Privatedemo{
    public static void main(String[] args){
        Privdemo obj1 = new Privdemo();
        System.out.println(obj1.a);
        obj1.display();
    }
}

