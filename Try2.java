class Try2{
    public static void main(String[] args){
        try{
            int [] arr = {10,20,30,40};
            System.out.println(arr[0]);
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside out of bounds");
        }
        catch(Exception e){
            System.out.println("Inside exception");
        }
        finally {
            System.out.println("code 66");
        }
    }
}