package lesson1.abstraction;

public abstract class PersonServiceA {
  int test;

  public abstract void savePerson();

  public abstract void deletePerson();

  public abstract void updatePerson();

  public abstract void readPerson();

  public void test() {
    System.out.println("This is working");
  }
}
