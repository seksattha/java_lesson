public class Person {
    // กำหนด Attributes
    String fname;
    String lname;
    String sex;

    // สร้าง constructor
    public Person(String fname, String lname, String sex) {
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
    }
    public String toString() {
        return "ชื่อ:" + fname + "นามสกุล:" + lname;
    }
}
