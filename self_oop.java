// class Student{
//     String name;
//     int rollno;

//     Student(){
//         this.name = "unknown";
//         this.rollno = 0;
//     }
 
//     Student(String name, int rollno){
//         this.name = name;
//         this.rollno = rollno;
//     }
//     void disStud(){

//         System.out.println("the name is " + name + " and roll is " + rollno);
//     }
//     }

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog is eating");
    }
}



class self_oop{
public static void main(String[] args){
    Dog d1 =  new Dog();

    d1.eat();
    d1.bark();
    
}
}