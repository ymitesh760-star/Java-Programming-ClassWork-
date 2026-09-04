class Try3{
    public static void main(String[] args){
        try{
            int age = 15;
            if(age<18){
                throw new Exception("not eligible");
                
            }
            System.out.println("ehikpo");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}