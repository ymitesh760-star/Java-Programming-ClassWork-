// import java.util.scanner;

// class statement{
//     int curr;
//     int money;
//     void deposit(){
//         if(curr == curr + money){
//         System.out.println("the amount money deposited is: " + curr);
//         }
//     }

//     void withdraw(){
//         if(curr == curr - money){
//         System.out.println("amount of withdraw is: " + curr);
//         }
//     }
//     void BalanceEnquiry(){
//         if(curr ==curr){
//         System.out.println("amount of BalanceEnquriry is: " + curr );
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         statement s1 = new statement();

//         int curr = 2;

//         switch (curr){
//             case 1:
//                 s1.deposit();
//                 break;

//             case 2:
//                 s1.withdraw();
//                 break;

//             case 3:
//                 s1.BalanceEnquiry();
//                 break;
//         }
//     }
// }

class Bank {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException{
        
        if (amount > balance) {
            throw new InsufficientBalanceException("Enter valid amount: ");
            System.out.println("inside amount");
            return;
        }
        double remaining = balance - amount;
        System.out.println("Reamining amount :" + remaining);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class Test {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }
}