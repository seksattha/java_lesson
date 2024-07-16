public class methodOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String concatenate(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        methodOverloading math = new methodOverloading();

        // Calling methods with different sets of parameters
        System.out.println("Sum of 5 and 10: " + math.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + math.add(5, 10, 15));
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));
        System.out.println("Concatenated string: " + math.concatenate("Hello", "World"));
    }
}
