import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class hw003 {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    static void ex1() {

        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = new ArrayList<>();
        int listLength = 10;

        System.out.println("Произвольный список целых чисел: ");
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(0, 10));
        }
        System.out.println(list);

        System.out.println("Произвольный список целых нечётных чисел: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }

    static void ex2() {

        // Задан целочисленный список ArrayList. 
        // Найти минимальное, максимальное и
        // среднее арифметическое из этого списка. Collections.max()
        List<Integer> list = new ArrayList<>();
        int listLength = 5;

        Random random = new Random();
        System.out.println("Целочисленный список: ");
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(0, 10));
        }
        System.out.println(list);

        System.out.println("Минимальное значение списка: " + Collections.min(list));

        System.out.println("Максимальное значение списка: " + Collections.max(list));

        double summ = 0;
        for (int i = 0; i < list.size(); i++) {
            summ += list.get(i);
        }
        double arithmetic = summ/list.size();
        System.out.println("Среднее арифметическое элементов списка: " + arithmetic);

    }
}