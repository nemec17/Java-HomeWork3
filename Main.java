package Three;

import javafx.scene.control.TextFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();

        System.out.println("Вес первой коробки с апельсинами: " + or.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + or1.getWeight());
        System.out.println("Вес первой коробки с яблоками: " + ap.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + ap1.getWeight());


        System.out.println("'+' - Добавили фруктов: ");

        System.out.println("Сколько добавим в первую апельсинов коробку?");
        Scanner scanner1 = new Scanner(System.in);
        int n1 = scanner1.nextInt();

        System.out.println("Сколько добавим во вторую впельсинов коробку?");
        Scanner scanner2 = new Scanner(System.in);
        int n2 = scanner2.nextInt();

        System.out.println("Сколько добавим в первую яблок коробку?");
        Scanner scanner3 = new Scanner(System.in);
        int n3 = scanner3.nextInt();

        System.out.println("Сколько добавим во вторую яблок коробку?");
        Scanner scanner4 = new Scanner(System.in);
        int n4 = scanner4.nextInt();

        or.addFruit(new Orange(), n1);
        or1.addFruit(new Orange(), n2);
        ap.addFruit(new Apple(), n3);
        ap1.addFruit(new Apple(), n4);

        System.out.println("Вес первой коробки с апельсинами и второй равный ? " + or.compare(or1));
        System.out.println("Вес первой коробки с яблоками и второй равный ? " + ap1.compare(ap));

        ap.pourTo(ap1);
        or.pourTo(or1);

        System.out.println("Коробка первая с апельсинами: " + or.getWeight());
        System.out.println("Коробка вторая с апельсинами: " + or1.getWeight());
        System.out.println("Коробка третья с яблоками: " + ap.getWeight());
        System.out.println("Коробка четвертая с яблоками: " + ap1.getWeight());

        Main.Change();
    }

    public static void Change() {
        System.out.print("Введите размер массива: ");
        Scanner scanner0 = new Scanner(System.in);
        Integer m = scanner0.nextInt();

        int[] mas = new int[m];

        for (int i = 0; i < mas.length; i++) {
            float ran = (float) (Math.random() * 100);
            int random = (int) ran;
            mas[i] = random;
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        System.out.print("Введите первое число для замены от 0 до 9: ");
        Scanner scanner1 = new Scanner(System.in);
        Integer a = scanner1.nextInt();

        System.out.print("Введите второе число для замены от 0 до 9: ");
        Scanner scanner2 = new Scanner(System.in);
        Integer b = scanner2.nextInt();

        Integer change = mas[a];
        mas[a] = mas[b];
        mas[b] = change;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
