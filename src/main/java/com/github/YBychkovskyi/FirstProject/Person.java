package com.github.YBychkovskyi.FirstProject;

public class Person {
  String fullName;
  int age;

  public Person() {
  }

  public Person(String fullName, int age) {
    this.fullName = fullName;
    this.age = age;
  }

  public void move() {
    System.out.println("Такой-то " + fullName + " говорит");
  }

  public void talk() {
    System.out.println("Такой-то" + fullName + " говорит");
  }

  public static void main(String[] args) {
    Person person = new Person("Name", 20);
    Person person1 = new Person();
    person.move();
  }
}
