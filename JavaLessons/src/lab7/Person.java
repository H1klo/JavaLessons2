package lab7;

public class Person {
    String surname,name,street,zipCode,city;
    public void initialize(String surname,String name, String street, String zipCode, String city){
        this.surname = surname;
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }
    public void print(){
        System.out.print(this.surname +" "+  this.name + " "+ this.street + " "+this.zipCode + " "+ this.city);
    }

}
