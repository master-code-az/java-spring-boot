package lesson1.inheritance;

public class Cat extends Animal {

  public String test;

  public Cat() {
  }

  public Cat(String name, int age) {

    super(name, age);
    super.a = 11;
    super.sound();
    this.test = "A";
    this.sound();

  }

  @Override
  public void sound() {
    System.out.println("Meaooo");
  }
}
