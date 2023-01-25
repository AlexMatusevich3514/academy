package by.academy.homework6.task3;
//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте каталог(папку) users и
//для каждого пользователя создайте файл в этом каталоге. Назовите файл Имя_Фамилия.txt. Сериализуйте информацию
//о пользователе и положите в файл пользователя. Не забываем закрывать потоки. В блоке catch выводим сообщение
//ошибки на экран (System.err.println(e.getMessage());)

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static int i = 0;

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ivan", "Petrov", 20));
        users.add(new User("Petr", "Sidorov", 30));
        users.add(new User("Sidr", "Ivanov", 40));
        users.add(new User("Denis", "Kozlov", 20));
        users.add(new User("Arnold", "Schwarzenegger", 60));
        users.add(new User("Silvestr", "Stallone", 65));
        users.add(new User("Jan-Klod", "Damm", 20));
        users.add(new User("Ilya", "Muromec", 1));
        users.add(new User("Kot", "Matroskin", 100));
        users.add(new User("Wednesday", "Adams", 21));

        File fileDir = new File("C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task3\\users");
        if (!fileDir.exists()) {
            fileDir.mkdir();
        }
        ArrayList<File> files = new ArrayList<>();

        for (User u : users) {
            files.add(new File(fileDir, (u.getName() + "_" + u.getFamily()) + ".txt"));
        }

        //записываем информацию о объектах в файл
        for (User u : users) {
            try (FileOutputStream fos = new FileOutputStream(files.get(i));
                 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
                oos.writeObject(u);
                i++;
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        //Восстанавливаем информаию об объектах. Читаем из файла и сохраняем объекты в <Arraylist> users1
        ArrayList<User> users1 = new ArrayList<>();
        for (File f : files) {
            try (FileInputStream fis = new FileInputStream(f);
                 ObjectInputStream ois = new ObjectInputStream(fis);) {
                users1.add((User) ois.readObject());
            } catch (IOException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(users1);
    }
}

