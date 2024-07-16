public class ControlFlow {
    public static void main(String[] args) {
        int age = 75;
        if (age < 18) {
            System.out.println("you are not allow");
        } else if (age >= 18 && age < 60) {
            System.out.println("You're welcome");

        }else {
            System.out.println("You're too old!");
        }
    }
}
