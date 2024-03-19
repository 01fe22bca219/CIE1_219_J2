class extended_calculator extends calculator {
    public static void main(String[] args) {
        int a=4;
        square(a);
        cube(a);
    }
    

    
    public static void square(int a){
        System.out.println("Square: "+ (a*a));
    }
    public static void cube(int a){
        System.out.println("Cube: "+ (a*a*a));
    }

    
}