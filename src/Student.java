public class Student extends Person {
    // กำหนด Attributes
    String s_id;

    // สร้าง constructor
    public Student(String s_id, String fname, String lname, String sex) {
        super(fname, lname, sex);
        this.s_id = s_id;
    }
    @Override
    public String toString() {
        return "รหัส:" + s_id + " " + super.toString(); // Calls superclass toString() method
    }
}
