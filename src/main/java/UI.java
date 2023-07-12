import Animals.Animal;
import Exceptions.UncorrectDataException;

import java.util.Scanner;

public class UI {
    private static Scanner in = new Scanner(System.in);
    public static void menu() {
        boolean flag = true;
        while (flag){
            System.out.println("Меню: "
                    + "\n1. Завести новое животное"
                    + "\n2. Список команд животного"
                    + "\n3. Обучить новой команде"
                    + "\n4. Список всех животных"
                    + "\n5. Выход");
            int input = in.nextInt();
            if (input == 1){
                try (Counter counter = new Counter()){
                    counter.add();
                    ControllerAnimal.addAnimal();
                } catch (RuntimeException e){
                    System.err.println(e.getMessage());
                }

            } else if (input == 2) {
                System.out.println(ControllerAnimal.listAnimals());
                System.out.println("Выберите животного по ID: ");
                int id = in.nextInt();
                for (Animal an: ControllerAnimal.listAnimal)  {
                    if (id == an.getAnimalID()) {
                        an.listCommand();
                        break;
                    }
                }
            } else if (input == 3) {
                System.out.println(ControllerAnimal.listAnimals());
                System.out.println("Выберите животного по ID: ");
                int id = in.nextInt();
                for (Animal an: ControllerAnimal.listAnimal)  {
                    if (id == an.getAnimalID()){
                        in.useDelimiter("\\n");
                        System.out.print("Введите команду: ");
                        String command = in.next();
                        System.out.print("Что будет делать: ");
                        String action = in.next();
                        an.newCommand(command,action);
                        break;
                    }
                }
            } else if (input == 4) {
                System.out.println(ControllerAnimal.listAnimals());
            } else if (input == 5) {
                flag = false;
            } else {
                System.out.println("Вы ввели неправильное значение!!!");
            }
        }
    }
}
