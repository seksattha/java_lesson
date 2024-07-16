import java.util.ArrayList;
import java.util.List;

public class listExample {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.printf("Hello and welcome!");

        // Loop to print numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);

        }

        List<String> names = new ArrayList<>();
        names.add("Eagle");
        names.add("Agena");
        names.add("Aquarius");

        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }


        for (int i = 0; i < names.size(); i++){
            System.out.println("index "+ i + " " + names.get(i));
        }




    }
}
