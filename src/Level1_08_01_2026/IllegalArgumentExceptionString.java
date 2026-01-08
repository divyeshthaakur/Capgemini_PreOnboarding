package Level1_08_01_2026;

public class IllegalArgumentExceptionString {
    public static void generateException(){
        String s = "Khushi";
        System.out.println(s.substring(5,3));
    }
    public static void handleException(){
        String s = "Khushi";
        try{
            System.out.println(s.substring(5,3));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
