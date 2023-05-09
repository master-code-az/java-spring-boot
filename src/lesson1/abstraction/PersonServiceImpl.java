package lesson1.abstraction;

public class PersonServiceImpl implements  PersonService {

  @Override
  public void savePerson() {
    System.out.println("savePerson");
  }

  @Override
  public void deletePerson() {
    System.out.println("deletePerson");
  }

  @Override
  public void updatePerson() {
    System.out.println("updatePerson");
  }

  @Override
  public void readPerson() {
    System.out.println("readPerson");
  }
}
