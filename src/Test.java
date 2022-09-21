import animal.Animal;
import animal.Cat;
import animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Animal> animal = new ArrayList<>();

        animal.add(new Dog("bobik", 20, 40));
        animal.add(new Cat("iriska",60, 100));
        animal.add(new Dog("zhmurka", 400, 5));
        animal.add(new Dog("motya", 20, 300));
        animal.add(new Cat("klepa", 40, 1));
        animal.add(new Cat("iriska",1, 1));

        for (Animal a : animal) {
            if (a.getSubClass().contains("dog")) {
                ((Dog)a).run();
                ((Dog)a).swim();
            } else {
                ((Cat)a).run();
                ((Cat)a).swim();
            };
        }
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Animal.getCount());

    }



}
