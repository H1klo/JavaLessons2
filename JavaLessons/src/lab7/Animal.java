package lab7;

public abstract class Animal {
    String name;
    String age;
    String weightField;
    abstract void eat();


    abstract void getVoice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeightField() {
        return weightField;
    }

    public void setWeightField(String weightField) {
        this.weightField = weightField;
    }
}
