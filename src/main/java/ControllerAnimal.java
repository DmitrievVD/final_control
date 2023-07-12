import Animals.*;

import java.util.*;

public class ControllerAnimal {
    public static ArrayList<Animal> listAnimal = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);
    private static int counterID = 1;

    public static void addAnimal(){
        System.out.println("Какое животное?" + "\n1. Вьючное" + "\n2. Домашнее");
        int input = in.nextInt();
        if (input == 1) addPack();
        else if (input == 2) addPet();
        else System.out.println("Вы ввели не правильное значение!!!");
    }

    public static void addPet(){
        System.out.println("Какого животного хотите завести: " + "\n1. Собаку" + "\n2. Кота" + "\n3. Хомяка");
        int input = in.nextInt();
        if (input == 1) addDog();
        else if (input == 2) addCat();
        else if (input == 3) addHumster();
        else System.out.println("Вы ввели неправильное значение!!!");
    }

    public static void addPack(){
        System.out.println("Какого животного хотите завести: " + "\n1. Лошадь" + "\n2. Верблюда" + "\n3. Осла");
        int input = in.nextInt();
        if (input == 1) addHorse();
        else if (input == 2) addCamel();
        else if (input == 3) addDonkey();
        else System.out.println("Вы ввели неправильное значение!!!");
    }

    public static void addHorse(){
        System.out.print("Введите имя: ");
        String name = in.next();
        Date date = new Date();
        String bithday = (date.getDay() + "." + date.getMonth() + "." + (date.getYear() - 100)).toString();
        Horse horse = new Horse(counterID, name, bithday);
        counterID ++;
        listAnimal.add(horse);
    }
    public static void addCamel(){
        System.out.print("Введите имя: ");
        String name = in.next();
        Date date = new Date();
        String bithday = (date.getDay() + "." + date.getMonth() + "." + (date.getYear() - 100)).toString();
        Camel camel = new Camel(counterID, name, bithday);
        counterID ++;
        listAnimal.add(camel);
    }
    public static void addDonkey(){
        System.out.print("Введите имя: ");
        String name = in.next();
        Date date = new Date();
        String bithday = (date.getDay() + "." + date.getMonth() + "." + (date.getYear() - 100)).toString();
        Donkey donkey = new Donkey(counterID, name, bithday);
        counterID ++;
        listAnimal.add(donkey);
    }
    public static void addDog(){
        System.out.print("Введите имя: ");
        String name = in.next();
        Date date = new Date();
        String bithday = (date.getDay() + "." + date.getMonth() + "." + (date.getYear() - 100)).toString();
        Dog dog = new Dog(counterID, name, bithday);
        counterID ++;
        listAnimal.add(dog);
    }
    public static void addCat(){
        System.out.print("Введите имя: ");
        String name = in.next();
        Date date = new Date();
        String bithday = (date.getDay() + "." + date.getMonth() + "." + (date.getYear() - 100)).toString();
        Cat cat = new Cat(counterID, name, bithday);
        counterID ++;
        listAnimal.add(cat);
    }
    public static void addHumster(){
        System.out.print("Введите имя: ");
        String name = in.next();
        Date date = new Date();
        String bithday = (date.getDay() + "." + date.getMonth() + "." + (date.getYear() - 100)).toString();
        Humster humster = new Humster(counterID, name, bithday);
        counterID ++;
        listAnimal.add(humster);
    }

    public static String listAnimals(){
        return Arrays.toString(new ArrayList[]{listAnimal});
    }

}
