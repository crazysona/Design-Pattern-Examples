package com.airbnb.designpattern.creational.abstractfactory;

public interface AbstractFactory {
  Chair createChair();
  Table createTable();
}
