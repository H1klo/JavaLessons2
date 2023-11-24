package lab7;

public class PersonStaff {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("surname", "name", "street", "zipCode", "city");
        person.print();
        System.out.println();
        Staff staff = new Staff();
        staff.initialize("surname", "name", "street", "zipCode", "city");
        staff.initialize1("education","position");
        staff.print1();
    }
}
