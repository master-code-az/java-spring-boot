package lesson1.polimorphisim;

public class Fish extends Animal {

  public Fish(String name, int age) {
    super(name, age);
  }

  @Override
  public void sound() {
    System.out.println("Fish sound");
  }
}
