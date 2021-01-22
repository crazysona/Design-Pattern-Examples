package com.airbnb.designpattern.creational.prototype;

public class Client {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 3);
    System.out.println(String.format("%f, %f", rectangle.getArea(), rectangle.getPerimeter()));
    Shape clonedRectangle = (Shape) rectangle.cloneShape();
    System.out.println(String.format("%f, %f", rectangle.getArea(), rectangle.getPerimeter()));
    System.out.println(String.format("%s", clonedRectangle == rectangle));
  }
}
