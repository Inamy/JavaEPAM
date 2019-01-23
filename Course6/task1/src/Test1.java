import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую переменную ->");
        while (!sc.hasNextDouble()) {
            System.out.print("->");
            sc.next();
        }
        double a = sc.nextDouble();

        System.out.print("Введите вторую переменную ->");
        while (!sc.hasNextDouble()) {
            System.out.print("->");
            sc.next();
        }
        double b = sc.nextDouble();


        while (true) {
            System.out.print("Choose \n" +
                    "1 - Вывести аргументы\n" +
                    "2 - Изменить аргумент\n" +
                    "3 - Найти сумму аргументов\n" +
                    "4 - Найти наибольшее среди аргументов\n" +
                    "5 - Выход\n");

            int x = 0;
            int p = 0;
            while (x != 1) {
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                p = sc.nextInt();
                if (p > 0 && p < 10) x = 1;
            }


            switch (p) {
                case 1:
                    print(a, b);
                    break;
                case 2:
                    System.out.print("Какой аргумент изменить?(1 или 2) ");
                    while (p != 1 || p != 2) {
                        while (!sc.hasNextInt()) {
                            System.out.print("->");
                            sc.next();
                        }
                        p = sc.nextInt();

                        if (p == 1) change(a);
                        if (p == 2) change(b);
                        else System.out.print("Некорректный ввод, повторите попытку.");
                        break;
                    }
                case 3:
                    sum(a, b);
                    break;
                case 4:
                    max(a, b);
                    break;
                case 5:
                    System.exit(1);

            }
        }
    }

    public static void print(double a, double b) {
        System.out.println("Ваши аргументы: " + a + " и " + b);
    }

    public static double change(double x) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите новое значение ->");
        while (!sc.hasNextDouble()) {
            System.out.print("->");
            sc.next();
        }
        x = sc.nextDouble();
        return x;
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double max(double a, double b) {
        if (a < b) return b;
        if (a > b) return a;
        else {
            System.out.println("Аргументы равны");
            return 0;
        }

    }
}
