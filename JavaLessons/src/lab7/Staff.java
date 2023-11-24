package lab7;

public class Staff extends Person{
    String education, position;
    public void initialize1(String education, String position) {
        this.education = education;
        this.position = position;
    }
    public void print1(){
        print();
        System.out.println(" "+education + " " + position);
    }
}
