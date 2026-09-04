class MathematicalOperations {
    int no1;
    int no2;

    MathematicalOperations() {
        System.out.println("Inside Default Constructor");
        this.no1 = 10;
        this.no2 = 20;
    }

    MathematicalOperations(int x, int y) {
        System.out.println("Inside Parameterized Constructor");
        this.no1 = x;
        this.no2 = y;
    }

    public int Addition() {
        return this.no1 + this.no2;
    }

    public int Subtraction(){
        return this.no1 - this.no2;
    }

    public int Multiplication() {
        return this.no1 * this.no2;
    }

    public float Division() {
        return this.no2 / this.no1;
    }
}

class Arithmetic {
    public static void main(String arg[]) {

        System.out.println("Inside Main Function");

        MathematicalOperations obj1 = new MathematicalOperations();
        MathematicalOperations obj2 = new MathematicalOperations(40, 50);

        int ret = 0;

        ret = obj1.Addition();
        System.out.println("Addition of obj1 is " + ret);

        ret = obj2.Addition();
        System.out.println("Addition of obj2 is " + ret);

        ret = obj1.Subtraction();
        System.out.println("Addition of obj1 is " + ret);

        ret = obj2.Subtraction();
        System.out.println("Addition of obj2 is " + ret);


        ret = obj1.Multiplication();
        System.out.println("Addition of obj1 is " + ret);

        ret = obj2.Multiplication();
        System.out.println("Addition of obj2 is " + ret);

        float ret1 = 0.0f;

        ret1 = obj1.Division();
        System.out.println("Addition of obj1 is " + ret1);

        ret1 = obj2.Division();
        System.out.println("Addition of obj2 is " + ret1);
    }
}