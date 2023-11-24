package lab7;

public class MainAnimal {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Bird bird = new Bird("blue");
        Fish fish = new Fish();
        mammal.eat();
        mammal.getVoice();
        bird.eat();
        bird.getVoice();
        fish.eat();
        fish.getVoice();
    }
}
