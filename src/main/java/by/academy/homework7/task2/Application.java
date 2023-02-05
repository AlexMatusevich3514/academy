package by.academy.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {

        Person person = new Person("Vinny", "Pooh", 10, "01.01.2013");
        User user = new User("Anonim", "123456", "anonim@mail.ru");

        Class classPerson = Person.class;
        Class classUser = User.class;

        Method[] methods = classPerson.getMethods();
        System.out.println("Методы класса Person через getMethods:");
        for (Method m : methods) {
            System.out.println(m);
        }

        Method[] methods1 = classUser.getMethods();
        System.out.println("Методы класса User через getMethods:");
        for (Method m : methods1) {
            System.out.println(m);
        }

        // Вызов метода по имени
        Method method = classUser.getMethod("printUserInfo");
        System.out.println(method);


        // Поля класса Person через getFields
        Field[] fields = classPerson.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        //  Поля класса User через getFields
        Field[] fields1 = classUser.getFields();
        for (Field f : fields1) {
            System.out.println(f);
        }
        //вызов методов через getDeclaredMethod(s)
        Method decMethod = classPerson.getDeclaredMethod("setFirstName", String.class);
        Method[] decMethods = classPerson.getDeclaredMethods();
        Method decMethod1 = classUser.getDeclaredMethod("printUserInfo");
        Method[] decMethods1 = classUser.getDeclaredMethods();

        //вызов полей через getDeclaredFields(s)
        Field decField = classUser.getDeclaredField("login");
        Field[] decFields = classUser.getDeclaredFields();
        Field decField1 = classPerson.getDeclaredField("firstName");
        Field[] decFields1 = classPerson.getDeclaredFields();

        //меняем поле объекта Person
        Field field = classPerson.getDeclaredField("firstName");
        field.setAccessible(true);
        System.out.println(field.get(person));
        field.set(person, "Tom");
        System.out.println(field.get(person));

        //меняем поле объекта User
        Field field2 = classUser.getDeclaredField("login");
        field.setAccessible(true);
        System.out.println(field.get(user));
        field.set(user, "Bob");
        System.out.println(field.get(user));

        //вывод всех полей объекта Person
        Field[] field1 = classPerson.getDeclaredFields();
        for (Field f : field1) {
            f.setAccessible(true);
            System.out.println(f.get(person));
            if (Modifier.isPrivate(f.getModifiers())) {
                System.out.println("Поле " + f.getName() + " имеет модификтор " + " Private");
            } else if (Modifier.isProtected(f.getModifiers())) {
                System.out.println("Поле " + f.getName() + " имеет модификтор " + "Protected");
            } else if (Modifier.isPublic(f.getModifiers())) {
                System.out.println("Поле " + f.getName() + " имеет модификтор " + "Public");
            } else {
                System.out.println("Иной тип модификатора доступа");
            }
        }

        //вызвать метод "printUserInfo" через invoke
        Method method1 = classUser.getMethod("printUserInfo");
        method1.invoke(user);
    }
}
