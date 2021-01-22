package com.airbnb.designpattern.creational.prototype;

public class Rectangle implements Shape, Cloneable{
  private int width;
  private int height;

  public Rectangle(int width, int height){
    this.width = width;
    this.height = height;
  }

  public Rectangle(Rectangle rectangle){
    width = rectangle.width;
    height = rectangle.height;
  }

  @Override
  public double getPerimeter() {
    return (width + height) * 2.0;
  }

  @Override
  public double getArea() {
    return width * height * 1.0;
  }

  @Override
  public Object cloneShape() {
    return new Rectangle(this);
  }
}
