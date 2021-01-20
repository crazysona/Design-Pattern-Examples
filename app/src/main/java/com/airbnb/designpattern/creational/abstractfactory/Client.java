package com.airbnb.designpattern.creational.abstractfactory;

public class Client {
  public static void main(String[] args) {
    String style = "modern";
    AbstractFactory factory = null;
    if (style == "classic") {
      factory = new ClassicFactory();
    } else {
      factory = new ModernFactory();
    }
    Chair chair = factory.createChair();
    Table table = factory.createTable();
    System.out.println(chair.sit("Bob"));
    System.out.println(table.place("apple"));
  }
}
