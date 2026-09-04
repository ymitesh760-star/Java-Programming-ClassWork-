class Animal {
    abstract void sound();

    void steps() {
        System.out.println("Inside steps");
    }

  }

class Dog extends Animal {
    

  void sound(){
    System.out.println("Inside Sound");
  }
} 

class AbstractDemo{
    public static void main(String[] args){
        
        Dog obj = new Dog();
        obj.sound();
        obj.steps();
    }
}