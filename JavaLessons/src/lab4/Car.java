package lab4;

import java.text.MessageFormat;

public class Car {
    private String model,brand,year,color;
    private int quantity,price;
    Car(String model,String brand, String year, String color, int quantity, int price){
        this.model = model;
        this.brand = brand;
        this.year=year;
        this.color=color;
        this.quantity=quantity;
        this.price=price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int quantity){
        this.quantity+= quantity;
    }
    public void sell(int quantity){
        this.quantity -=quantity;
    }

    @Override
    public String toString() {
        return(MessageFormat.format("""
                model: {0}
                brand: {1}
                year: {2}
                price: {3}
                color: {4}
                quantity: {5}
                """,model,brand,year,price,color,quantity));
    }
    
}
