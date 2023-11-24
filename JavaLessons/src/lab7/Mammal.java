package lab7;

public class Mammal extends Animal implements AnimalBehavior,AnimalMove{
    @Override
    void eat() {
        System.out.println("Mammal eat");
    }

    @Override
    void getVoice() {
        System.out.println("Mammal voice");
    }
    String furColor;

    Mammal(String name,
         String age,
         String weightField,
         String furColor){
        this.name = name;
        this.age = age;
        this.weightField = weightField;
        this.furColor = furColor;

    }
    Mammal(String furColor){
        this.furColor = furColor;
    }
    Mammal(){}

    void canRun(){
        System.out.println("can run");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping");
    }
}
