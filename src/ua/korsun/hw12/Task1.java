package hw12;



public class Task1 {
    public static void main(String[] args) {
        try{
            throw new Exception("String");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            System.out.println("we are in a finally block");
        }

    }
}
