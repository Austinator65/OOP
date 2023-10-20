package Composition;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rokey", 3);
        Cat myCat = new Cat("Nannu", 2);

        Person person1 = new Person("Austin");
        Person person2 = new Person("Atiso");

        person1.setPet(myCat);
        person2.setPet(myDog);

        System.out.println(person1.getName() + " has a pet named " + person1.getPet().getName());
        System.out.println(person2.getName() + " has a pet named " + person2.getPet().getName());
    }
}
