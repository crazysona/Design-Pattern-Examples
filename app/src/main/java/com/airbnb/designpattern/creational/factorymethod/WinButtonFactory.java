package com.airbnb.designpattern.creational.factorymethod;

public class WinButtonFactory extends ButtonFactory{
  @Override
  Button createButton() {
    return new WinButton();
  }
}
