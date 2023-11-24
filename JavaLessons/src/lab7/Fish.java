package lab7;

public class Fish extends Animal implements AnimalBehavior,AnimalMove{
    @Override
    void eat() {
        System.out.println("Fish eat");
    }

    @Override
    void getVoice() {
        System.out.println("Fish voice");
    }

    String fishScale;
    Fish(String name,
         String age,
         String weightField,
         String fishScale){
        this.name = name;
        this.age = age;
        this.weightField = weightField;
        this.fishScale = fishScale;

    }
    Fish(String fishScale){
        this.fishScale = fishScale;
    }
    Fish(){}
    void canSwim(){
        System.out.println("can swim");
    }

    @Override
    public void sleep() {
        System.out.println("Fish is sleeping");
    }

    @Override
    public void move() {
        System.out.println("fish is swimming");
    }
}
