package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Phone {
  private int number;
  private String model;
  private int weight;

  public Phone(int number, String model, int weight) {

    this(number, weight);

    this.number = number;
    this.model = model;
    this.weight = weight;
  }

  public Phone(int number, int weight) {
    this.number = number;
    this.weight = weight;
  }

  public Phone() {
  }

  public static void main(String[] args) {
    Phone phone = new Phone(1230, "iPhone - 12", 120);
    Phone phone1 = new Phone(2134, "nokia",100);
    Phone phone2 = new Phone(5436,"Lenovo", 150);

    System.out.println(phone);
    System.out.println(phone1);
    System.out.println(phone2);

    phone.receiveCall("Name");
    phone.receiveCall("Name", phone.number);
    System.out.println(phone.getNumber(phone.number));

    phone1.receiveCall("Name1");
    phone1.receiveCall("Name1", phone1.number);
    System.out.println(phone.getNumber(phone1.number));

    phone2.receiveCall("Name2");
    phone2.receiveCall("Name2", phone2.number);
    System.out.println(phone.getNumber(phone2.number));
  }

  public void receiveCall(String name) {

    System.out.println("Звонить " + name);

  }

  public int getNumber(int number) {
    return number;
  }

  public void receiveCall(String name, int number) {

    System.out.println("Звонить " + name + " " + number);

  }

  public static void sendMessage(int... number) {
    System.out.println(Arrays.toString(number));
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    if (model == null) {
      throw new RuntimeException();
    }
    this.model = model;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Phone{" +
      "number=" + number +
      ", model='" + model + '\'' +
      ", weight=" + weight +
      '}';
  }
}
