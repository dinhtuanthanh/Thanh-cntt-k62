package Person;

public class Test{
    public static void main(String[] args) {
        Student s = new Student("THANH", 21, "QUANG BINH", 9.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("HOA",  28 ,"TP HCM", 1700);
        t.display();
    }
}