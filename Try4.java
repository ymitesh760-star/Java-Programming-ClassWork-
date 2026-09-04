class Try4{
    static void divide() throws ArithmeticException{
    int a = 10/0;
}
    public static void main(String[] args){
        try{
            divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e)
        }
        
    }
}