import java.util.Locale;

public class Comment {
    public static void main(String[] args) {
        //Простой вывод на экран
        System.out.println("Простой вывод на экран");


        //определяем длину строки
        String name = "GromoPetr";
        int count = name.length();
        System.out.println("Выводим количество символов в " + name);
        System.out.println(count);

        //Преобразование символов в нижний регистр
        String name2 = "Ехал Грека Через Реку";
        String name3 = name2.toLowerCase();
        System.out.println("Преобразование в нижний регистр");
        System.out.println("Результат преобразования: " + name3);

        //Преобразование в верхний регистр
        String name4 = name3.toUpperCase();
        System.out.println("Преобразование в верхний регистр");
        System.out.println("Результат преобразования: " + name4);


    }

}
