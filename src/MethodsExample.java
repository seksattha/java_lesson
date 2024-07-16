public class MethodsExample {
    private float radius; // Attribute to store the radius

    // Method to set the radius
    public void setRadius(float r) {
        radius = r;
    }

    // Method to calculate and return the area of the circle
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    // Method to calculate and return the circumference of the circle
    public float calculateCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        MethodsExample example = new MethodsExample();

        // Set the radius (optional if you want to set it before calculating area and circumference)
        example.setRadius(5.782f);

        // Calculate and print the area
        float area = example.calculateArea();
        System.out.println("Area of the circle with radius " + example.radius + ": " + area);

        // Calculate and print the circumference
        float circumference = example.calculateCircumference();
        System.out.println("Circumference of the circle with radius " + example.radius + ": " + circumference);
    }
}
