public  class Practical_01{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println();
        
        int age = 20;
        double salary = 35000.75;
        char grade ='A';
        boolean isStudent = true;
        String name = "Dinnu";
        System.out.println();
        //implicit casting
        int number = 50;
        double result = number;
        System.out.println("Implicit Type Casting");
        System.out.println("Integer value: " + number);
        System.out.println("Converted to double: " + result);
        System.out.println();
        
        //explicit casting
        double marks = 89.75;
        int totalMarks = (int)marks;
        System.out.println("Explicit Type Casting");
        System.out.println("Double value: " + number);
        System.out.println("Converted to Integer: " + result);
    }
}