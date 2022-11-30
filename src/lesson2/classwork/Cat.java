package lesson2.classwork;

public class Cat {
    private int age;
    private String nickname;
    private int money;
    private char initials;
    private boolean isHomeAnimal;

    public Cat() {
    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public char getInitials() {
        if (nickname == null)
            return 33;
        else
            return nickname.charAt(0);
    }

    public void setInitials(String nickname) {
        this.initials = nickname.charAt(0);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
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
