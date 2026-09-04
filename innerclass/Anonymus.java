interface Greeting{
    void display();
}

public class Anonymus{
    public static void main(String[] args){
    Greeting g1 = new Greeting(){
       public void display(){
            System.out.println("Inside display");
        }
    };
    g1.display();
    }
}