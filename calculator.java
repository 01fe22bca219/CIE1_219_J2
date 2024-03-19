public class calculator {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        addition(a, b);
        subtraction(a, b);
        division(a, b);
        multiplication(a, b);
        
    }

    public static void addition(int a, int b) {
        System.out.println("Addition:"+(a+b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction:"+(a-b));
    }

    public static void division(int a, int b) {
        
            System.out.println("Division:"+(a/b));        
        }

    public static void multiplication(int a, int b) {
        System.out.println("Multiplication:"+(a*b));
    }
   
}