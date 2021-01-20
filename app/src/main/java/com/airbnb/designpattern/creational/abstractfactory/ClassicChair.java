package com.airbnb.designpattern.creational.abstractfactory;

public class ClassicChair implements Chair {
  @Override
  public String sit(String name) {
    return String.format("%s is sitting on a classic chair", name);
  }
}
