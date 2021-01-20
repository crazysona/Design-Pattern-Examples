package com.airbnb.designpattern.creational.factorymethod;

public class MacButtonFactory extends ButtonFactory{
  @Override
  Button createButton() {
    return new MacButton();
  }
}
