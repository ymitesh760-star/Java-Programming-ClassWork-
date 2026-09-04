class Animal {
  void sound() {
    System.out.println("Animal sound");

  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Meow!!!");
  }

  void show() {
    super.sound();

  }
}

public class Sabsupar {
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.show();
  }
}

// homework is make a bank and customer class and include super function in it