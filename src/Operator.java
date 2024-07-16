public class Operator {
    public static void main(String[] args) {
        //Unary Operator
        // Post - Increment
        int a = 10;
        int preIncrement = ++a;
        System.out.println("Pre-increment:" + preIncrement);
        System.out.println("After pre-increment" + a);


        int b = 10;
        int postIncrement = b++;
        System.out.println("Post-increment: " + postIncrement); // Output: 10
        System.out.println("After post-increment, a is now: " + b); // a is now 11

        int[] numbers = new int[5];
        int index = 0;

        for (int i = 1; i<= 5; i++){
            numbers[index++] = i;
            //แบบนี้จะเป็นค่าได้ แต่ถ้าเป็น ++index มันจะบวกไปก่อนเลย 1 แล้วค่อยเพิ่มค่า มันถึงเรียกว่า pre-increment
        }





    }

}

