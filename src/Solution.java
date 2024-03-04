import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {

        //Ввод с клавиатуры
        //Создаем объект класса сканер
        Scanner console = new Scanner(System.in);

        //Считываем с клавиатуры строку текста
        System.out.println("Введите текст:");
        String nameConsoleString = console.nextLine();

        //Или считываем с клавиатуры число
        System.out.println("Введите число:");
        int nameConsoleInt = console.nextInt();

        //Выводим на экран
        System.out.println("Text " + nameConsoleInt);
        System.out.println("Text " + nameConsoleString);

    }
}
