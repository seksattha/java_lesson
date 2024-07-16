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

        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week is: " + dayName);

        // LOOP
            //for loop
        for (int count = 0; count<20; count++){
            System.out.println(count);
        }
            //while loop
        int count = 1;
        while (count < 5){
            System.out.println("Count : " + count);
            count++;
        }
            // do-while loop



    }
}
