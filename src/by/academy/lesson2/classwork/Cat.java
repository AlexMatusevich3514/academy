package by.academy.lesson2.classwork;

public class Cat {
    public int age;
    public String nickname;
    public double money;
    public char initials;
    boolean isHomeAnimal;

    public Cat() {
        super();
    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void buy(){
        money-=10;
    }

    public int getAge() {
        return age;
    }

    public void grow() {
        age += 1;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void walk() {
        System.out.println("Кот гуляет");
    }
}
