package lesson1.polimorphisim;


public class Test {

  public static void main(String[] args) {
    Cat c1 = new Cat("C1", 1);
    Cat c2 = new Cat("C2", 1);
    c2.sound();

    Fish f1 = new Fish("F1", 2);
    Fish f2 = new Fish("F2", 2);

    Dog d1 = new Dog("D1", 4);
    Dog d2 = new Dog("D2", 4);

    Animal[] animals = new Animal[6];
    animals[0] = c1;
    animals[1] = c2;
    animals[2] = f1;
    animals[3] = f2;
    animals[4] = d1;
    animals[5] = d2;

    printAnimals(animals);
  }

  private static void printAnimals(Animal[] animals) {
    for (Animal animal : animals) {
      System.out.println(animal);
    }
  }

  private static void printAnimals(Cat[] cats) {
    for (Animal animal : cats) {
      System.out.println(animal);
    }
  }

  private static void printAnimals(Dog[] dogs) {
    for (Animal animal : dogs) {
      System.out.println(animal);
    }
  }

}
