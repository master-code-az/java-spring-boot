package lesson1.inheritance;

public class Animal {
  private String name;
  private int age;
  public  int a;

  public Animal() {
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sound() {
    System.out.println("This in an animal sound");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "[" +
        "name='" + name + '\'' +
        ", age=" + age +
        ']';
  }

}
