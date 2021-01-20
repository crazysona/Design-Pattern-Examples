package com.airbnb.designpattern.creational.factorymethod;

public abstract class ButtonFactory {
  void play(){
    Button button = createButton();
    System.out.println(button.click(0, 0));
    System.out.println(button.click(1, 1));
    System.out.println(button.click(2, 2));
    System.out.println(button.click(3, 3));
  }
  abstract Button createButton();
}
