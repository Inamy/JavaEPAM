package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args)
    {
	    task25();
    }

    static void task1()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.print(i + "\n");
        }
    }

    static void task2()
    {
        for (int i = 5; i > 0; i--)
        {
            System.out.print(i + "\n");
        }
    }

    static void task3()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i * 3) + "\n");
        }
    }

    static void task4()
    {
        int x = 2;
        while (x <= 100)
        {
            if (x % 2 == 0) System.out.print(x + "\n");
            x++;
        }

    }

    static void task5()
    {
        int x = 1, sum = 0;
        while (x <= 99)
        {
            if (x % 2 == 1)
                sum += x;
            x++;
        }
        System.out.print(sum);
    }

    static void task6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt(), sum = 0;

        for (int i = 1; i <= a; i++) sum += i;
        System.out.print(sum);
    }

    static void task7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter h ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int h = sc.nextInt();
        int x = a;
        int rez;

        while (x <= b)
        {
            if (x <= 2)
                rez = -x;
            else rez = x;
            System.out.print(rez + "\n");
            x += h;
        }

    }

    static void task8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        System.out.print("Enter h ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int h = sc.nextInt();
        int x = a;
        int rez;

        while (x <= b)
        {
            if (x == 15)
                rez = (x + c) * 2;
            else rez = (x - c) + 6;
            System.out.print(rez + "\n");
            x += h;
        }
    }

    static void task9()
    {
        int x = 0;
        for (int i = 1; i < 101; i++)
        {
            x += pow(i,2);
        }
        System.out.print(x);
    }

    static void task10()
    {
        double x = 1;
        for (int i = 1; i < 201; i++)
        {
            x = x * pow(i,2);
        }
        System.out.print(x);
    }

    static void task11()
    {
        double x = 0;

        for (int i = 199; i >= 0; i--)
        {
            x += pow(i,3);
        }

        System.out.print("Def of 200 cube = " + x);
    }

    static void task12()
    {
        int a[] = new int[10], rez = 1;

        a[0] = 1;

        for(int n = 1; n < 10; n++)
        {
            a[n] = 6 + a[n - 1];
            rez = rez * a[n];
        }

        System.out.print("Proizv 10 number`s = " + rez);
    }

    static void task13()
    {
        int a = -5, b = 5;
        double h = 0.5, x = a, y;

        while (x <= b)
        {
            y = 5 - (pow(x, 2) / 2);
            x += h;
            System.out.println(y);
        }
    }

    static void task14()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int n = sc.nextInt();

        double y = 0.5, temp = y;
        for (int i = 1; i <= n; i++)
        {
            temp += y / (2 * i);
        }

        System.out.print(temp);
    }

    static void task15()
    {
        int temp = 1;
        for (int i = 1; i < 11; i++)
        {
            temp += pow(i,2);
        }
        System.out.print("Sum = " + temp);
    }

    static void task16()
    {
        long temp = 1, rez = 1;
        for (int i = 2; i <= 10; i++)
        {
            temp += i;
            rez = rez * temp;
        }
        System.out.print("sum = " + rez);
    }

    static void task17()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        int n = -1;
        while (n < 0)
        {
            System.out.print("Enter n ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            a = a * (a + 1);
        }
        System.out.print("Sum = " + a);
    }

    static void task18()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int e = sc.nextInt();

        double a, sum = 0;
        int n = 1;
        while (true)
        {
            a = abs(pow(-1,(n-1)) / n);
            System.out.println(a);
            sum += a;
            n++;
            if (sum > e) {
                sum -= a;
                break;
            }
        }
        System.out.print("Sum = " + sum);
    }

    static void task19()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int e = sc.nextInt();

        double a, sum = 0;
        int n = 0;
        while (true)
        {
            a = abs((1 / pow(2,n)) + (1 / pow(3,n)));
            System.out.println(a);
            sum += a;
            n++;
            if (sum > e) {
                sum -= a;
                break;
            }
        }
        System.out.print("Sum = " + sum);
        /////////////////////////////////////////////////////
    }

    static void task20()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e ->");
        while (!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double e = sc.nextDouble();

        double a, sum = 0;
        int n = 1;
        while (true)
        {
            a = abs(1 / ((3 * n - 2)*(3 * n + 1)));
            System.out.println(a);
            sum += a;
            n++;
            if (sum > e) {
                sum -= a;
                break;
            }
        }
        System.out.print("Sum = " + sum);
        //////////////////////////////////////////////////
    }

    static void task21()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter h ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int h = sc.nextInt();
        int x = a;
        double rez;

        while (x <= b)
        {
            rez = x - sin(x);
            System.out.print(x + " | " +rez + "\n");
            x += h;
        }
    }

    static void task22()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter h ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int h = sc.nextInt();
        int x = a;
        double rez;

        while (x <= b)
        {
            rez = pow(sin(x),2);
            System.out.print(x + " | " +rez + "\n");
            x += h;
        }
    }

    static void task23()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter h ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int h = sc.nextInt();
        int x = a;
        double rez;

        while (x <= b)
        {
            rez = (1 / tan(x / 3)) + (1 / 2 * sin(x));
            System.out.print(x + " | " +rez + "\n");
            x += h;
        }
    }

    static void task24()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        int rezs = 0, x, rezo = 0;

        while(a != 0)
        {
            x = a % 10;
            if (x % 2 == 0)
            {
                rezs += x;
            }
            a = a / 10;
            System.out.println(x);
            rezo = (rezo + x) * 10;
        }
        System.out.println("Summ -> " + rezs + " Obratnoe -> " + (rezo / 10));
    }

    static void task25()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        int rez = 1;

        for (int i = 1; i <= a; i++)
        {
            rez *= i;
        }
        System.out.print(rez);
    }

    static void task26()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while (!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();
    }

    static void task27()
    {
        String s = "admin";
        byte[] bytes = s.getBytes("US-ASCII");
    }

}
