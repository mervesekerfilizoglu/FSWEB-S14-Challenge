package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public void setAddition2Name(String addition2Name) {
        this.addition2Name = addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);
        if (this.addition1Name != null) System.out.println("Addition1: " + this.addition1Name);
        if (this.addition2Name != null) System.out.println("Addition2: " + this.addition2Name);
        if (this.addition3Name != null) System.out.println("Addition3: " + this.addition3Name);
        if (this.addition4Name != null) System.out.println("Addition4: " + this.addition4Name);
        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }
}
