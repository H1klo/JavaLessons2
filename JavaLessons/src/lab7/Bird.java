package lab7;

public class Bird extends Animal implements AnimalBehavior,AnimalMove{
    String featherColor;
    Bird(String name,
    String age,
    String weightField,
    String featherColor){
        this.name = name;
        this.age = age;
        this.weightField = weightField;
        this.featherColor = featherColor;

    }
    Bird(String featherColor){
        this.featherColor = featherColor;
    }
    Bird(){}

    @Override
    void eat() {
        System.out.println("Bird eat");
    }

    @Override
    void getVoice() {
        System.out.println("Bird voice");
    }

    void canFly(){
        System.out.println("can fly");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
