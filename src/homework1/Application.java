package homework1;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Murzik");
        cat2.eat();
        cat2.sleep();
        cat2.walk();
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println("Коту без имени " + cat1.getAge() + " года.");
        System.out.println(cat2.getInitials());
        cat1.setNickname("Barsik");
        System.out.println(cat1.getInitials());
        System.out.println(cat1.isHomeAnimal());
        cat1.setHomeAnimal(true);
        System.out.println(cat1.isHomeAnimal());

    }
}



