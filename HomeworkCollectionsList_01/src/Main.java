import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();

        while (true) {
            showOperations();
            String choice = scanner.nextLine();
            System.out.println();
            if (choice.equals("0")) {
                System.out.println("Вы вышли из программы.");
                showToDoList(toDoList);
                break;
            } else if (choice.equals("1")) {
                System.out.print("Введите название задачи: ");
                String task = scanner.nextLine();
                toDoList.add(task);
            } else if (choice.equals("3")) {
                System.out.print("Введите номер для удаления: ");
                String stringDeleteTaskNumber = scanner.nextLine();
                int deleteTaskNumber = Integer.parseInt(stringDeleteTaskNumber) - 1;
                try {
                    toDoList.remove(deleteTaskNumber);
                    System.out.println("Удалено!");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Неверный номер задачи.");
                }
            } else if (choice.equals("4")) {
                System.out.print("Введите задачу для удаления: ");
                String deleteTask = scanner.nextLine();
                System.out.println(toDoList.remove(deleteTask) ? "Удалено!" : "Неверная задача.");
            } else if (choice.equals("5")) {
                System.out.print("Введите ключевое слово: ");
                String keyword = scanner.nextLine();
                List<String> indexList = new ArrayList<>();
                for (String s : toDoList) {
                    if (s.contains(keyword)) {
                        indexList.add(s);
                    }
                }
                System.out.println(toDoList.removeAll(indexList) ? "Успешно!" : "Задач с данным ключевым словом нет.");
            } else if (!choice.equals("2")) {
                System.out.println("Неверный номер операции");
            }
            showToDoList(toDoList);
        }
    }

    public static void showOperations() {
        System.out.println("Выберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Показать задачи");
        System.out.println("3. Удалить задачу по номеру");
        System.out.println("4. Удалить задачу по названию");
        System.out.println("5. Удалить задачи, содержащие ключевое слово");
        System.out.print("Ваш выбор: ");
    }

    public static void showToDoList(List<String> toDoList) {
        System.out.println("Ваш список дел:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
//        for (String s : toDoList) {
//            System.out.println((toDoList.indexOf(s) + 1) + ". " + s);
//        }
        System.out.println();
    }
}
