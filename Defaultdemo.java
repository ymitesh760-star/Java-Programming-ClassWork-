class Defaultdemo{
    int a = 10;

    void display(){
        System.out.println(a);
    }
}

class Main{
    public static void main(String[] args){
        Defaultdemo d1 = new Defaultdemo();
        System.out.println(d1.a);
        d1.display();
    }
}