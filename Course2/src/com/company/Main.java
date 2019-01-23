package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

    }

    static void task1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        if (x1 < x2) System.out.print(7);
        else System.out.print(8);
    }

    static void task2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        if (x1 < x2) System.out.print("Yes");
        else System.out.print("No");
    }

    static void task3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();


        if (x < 3) System.out.print("Yes");
        else System.out.print("No");
    }

    static void task4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        if (x1 == x2) System.out.print("Yes");
        else System.out.print("No");
    }

    static void task5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        if (x1 < x2) System.out.print(x1);
        if (x1 > x2) System.out.print(x2);
        else System.out.print("equal");
    }

    static void task6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        if (x1 < x2) System.out.print(x2);
        if (x1 > x2) System.out.print(x1);
        else System.out.print("equal");
    }

    static void task7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        System.out.print(abs(a * pow(x,2) + b * x + c));
    }

    static void task8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        if (sqrt(x1) < sqrt(x2)) System.out.print(x1);
        if (x1 > x2) System.out.print(x2);
        else System.out.print("equal");
    }

    static void task9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        if (a == b || a ==c || c == b) System.out.print("Equilateral");
        else System.out.print("Not equilateral");
    }

    static void task10()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int r1 = sc.nextInt();

        System.out.print("Enter r2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int r2 = sc.nextInt();

        if (r1 < r2) System.out.print("S2 more");
        if (r1 > r2) System.out.print("S1 more");
        else System.out.print("Equal");
    }

    static void task11()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a1, h1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a1 = sc.nextInt();
        int h1 = sc.nextInt();

        System.out.print("Enter a2, h2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a2 = sc.nextInt();
        int h2 = sc.nextInt();

        if ((0.5 * a1 * h1) < (0.5 * a2 * h2)) System.out.print("S2 more");
        if ((0.5 * a1 * h1) > (0.5 * a2 * h2)) System.out.print("S1 more");
        else System.out.print("Equal");
    }

    static void task12()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        if (a >= 0) System.out.print(pow(a,2));
        else System.out.print(pow(a,4));

        if (b >= 0) System.out.print(pow(b,2));
        else System.out.print(pow(b,4));

        if (c >= 0) System.out.print(pow(c,2));
        else System.out.print(pow(c,4));
    }

    static void task13()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter y1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        System.out.print("Enter xy ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y2 = sc.nextInt();

        if (x1 < x2 && y1 <= y2) System.out.print("Dot A closer");
        if (x1 > x2 && y1 >= y2) System.out.print("Dot B closer");
        if (x1 <= x2 && y1 < y2) System.out.print("Dot A closer");
        if (x1 >= x2 && y1 > y2) System.out.print("Dot B closer");
    }

    static void task14()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first corner ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter second corner ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        if ((180 - (a + b) > 0))
            if (a == 90 || b == 90 || (180 - (a + b)) == 90) System.out.print("Triangle exist with straight corner");
            else System.out.print("Triangle exist without straight corner");
        else System.out.print("Triangle don`t exist");
    }

    static void task15()
    {
        Scanner sc = new Scanner(System.in);
        double x = 0, y = 0;
        while (x == y)
        {
            System.out.print("Enter x ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            x = sc.nextInt();

            System.out.print("Enter y ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            y = sc.nextInt();

            if (x == y) System.out.print("Wrong enter!!!");
        }

        if (x < y)
        {
            double x1 = 0.5 * (x + y);
            double y1 = 2 * x * y;
            System.out.print("x = " + x1 + " y = " + y1);
        }
        if (x > y)
        {
            double y1 = 0.5 * (x + y);
            double x1 = 2 * x * y;
            System.out.print("x = " + x1 + " y = " + y1);
        }
    }

    static void task16()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        System.out.print("Enter y ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y = sc.nextInt();

        if (x == 0) System.out.print("Point on Ox");
        if (y == 0) System.out.print("Point on Oy");
        if (x > 0 && y > 0) System.out.print("Point in 1 fourth");
        if (x > 0 && y < 0) System.out.print("Point in 4 fourth");
        if (x < 0 && y > 0) System.out.print("Point in 2 fourth");
        if (x < 0 && y < 0) System.out.print("Point in 3 fourth");
    }

    static void task17()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int m = sc.nextInt();

        System.out.print("Enter n ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int n = sc.nextInt();

        if (m != n)
            if (m > n)
            {
                n = m;
                System.out.print("m = " + m + " n = " + n);
            }
            if (m < n)
            {
                m = n;
                System.out.print("m = " + m + " n = " + n);
            }
        else
            {
                m = n = 0;
                System.out.print("m = " + m + " n = " + n);
            }
    }

    static void task18_19()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        int i = 0, i1 = 0;
        if (a < 0) i++;
            if (a > 0) i1++;
        if (b < 0) i++;
            if (b > 0) i1++;
        if (c < 0) i++;
            if (c > 0) i1++;

        System.out.print("number of negative numbers = " + i);

        System.out.print("number of positive numbers = " + i1);
    }

    static void task20()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        System.out.print("Enter k ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int k = sc.nextInt();

        if (a % k == 0) System.out.print("k / a ");
        if (b % k == 0) System.out.print("k / b ");
        if (c % b == 0) System.out.print("k / c");
    }

    static void task21()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k ->");
        while(!sc.hasNext())
        {
            System.out.print("->");
            sc.next();
        }
        char k = sc.next().charAt(0);

        if (k == 'Д' || k == 'д' || k == 'G' || k == 'g') System.out.print("I like girl`s)");
        if (k == 'М' || k == 'м' || k == 'B' || k == 'b') System.out.print("I like boy`s");
    }

    static void task22()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        System.out.print("Enter y ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y = sc.nextInt();

        int temp;

        if (x > y) System.out.print("x = " + x + " y = " + y);
        if (x < y)
        {
            temp = x;
            x = y;
            y = temp;
            System.out.print("x = " + x + "y = " + y);
        }
        if (x == y) System.out.print("x = y");
    }

    static void task23()
    {
        int day = -1, month = -1;

        Scanner sc = new Scanner(System.in);
        while(day < 1 && day > 31)
        {
            System.out.print("Enter number of day(1 - 31) ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            day = sc.nextInt();
        }

        while (month < 1 && month > 12)
        {
            System.out.print("Enter number of month(1 - 12) ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            month = sc.nextInt();
        }

        System.out.print(day + "  " + month);
    }

    static void task24()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Love - no love\n");
        System.out.print("Enter number of petal ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int n = sc.nextInt();

        if (n % 2 == 0) System.out.print("Love");
        else System.out.print("No love");
    }

    static void task25()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter T ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int t = sc.nextInt();

        if (t >= 60) System.out.print("Warning!!!");
        else System.out.print("OK");
    }

    static void task26()
    {
        Scanner sc = new Scanner(System.in);
        int max, min;
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        if (a > b && a > c) max = a;
        if (b > a && b > c) max = b;
        if (c > b && c > a) max = c;
        else max = a;

        if (a < b && a < c) min = a;
        if (b < a && b < c) min = b;
        if (c < b && c < a) min = c;
        else min = a;

        System.out.print("max = " + max + " min = " + min + " sum = " + (max + min));
    }

    static void task27()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        System.out.print("Enter d ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int d = sc.nextInt();

        System.out.print(max(min(a,b),min(c,d)));
    }

    static void task28()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        System.out.print("Enter d ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int d = sc.nextInt();

        if (a == d) System.out.print("a = d");
        if (b == d) System.out.print("b = d");
        if (c == d) System.out.print("c = d");
        else System.out.print(max(max(d - a,d - b),d - c));
    }

    static void task29()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();

        System.out.print("Enter y1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y1 = sc.nextInt();

        System.out.print("Enter x2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x2 = sc.nextInt();

        System.out.print("Enter y2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y2 = sc.nextInt();

        System.out.print("Enter x3 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x3 = sc.nextInt();

        System.out.print("Enter y3 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y3 = sc.nextInt();

        if (x1 == x2 && x2 == x3) System.out.print("On line Ox");
        if (y1 == y2 && y2 == y3) System.out.print("On line Oy");
        else System.out.print("Not on line");
    }

    static void task30()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        if (a > b && b > c)
        {
            a = 2 * a;
            b = 2 * b;
            c = 2 * c;

            System.out.print("a = " + a + " b = " + b + " c = " + c);
        }
        else
        {
            a = abs(a);
            b = abs(b);
            c = abs(c);
            System.out.print("a = " + a + " b = " + b + " c = " + c);
        }
    }

    static void task31()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter B ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        System.out.print("Enter y ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y = sc.nextInt();

        System.out.print("Enter z ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int z = sc.nextInt();

        if ((x == a && y == b) || (y == a && x == b) || (x == a && z == b) || (x == b && z == a) || (y == a && z == b) || (y == b && z == a))
            System.out.print("Yes");
        else System.out.print("No");
    }

    static void task32()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        System.out.print("Enter y ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int y = sc.nextInt();

        System.out.print("Enter z ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int z = sc.nextInt();

        if (x + y > 0 || x + z > 0 || y + z > 0)
            System.out.print("Yes");
        else System.out.print("No");
    }

    static void task33()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int p = sc.nextInt();

        if (p == 9583 || p == 1747) System.out.print("A, B, C");
        if (p == 3331 || p == 7922) System.out.print("B, C");
        if (p == 9455 || p == 8997) System.out.print("C");
        else System.out.print("Warning!!! UNAUTHORIZED ACCESS");
    }

    static void task34()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of books ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        System.out.print("Enter your sum ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int s = sc.nextInt();

        if (c == s) System.out.print("Ty");
        if (c > s) System.out.print("Take your change");
        else System.out.print("Not enough money");
    }

    static void task35()
    {

        Scanner sc = new Scanner(System.in);
        int d = 0;
        while (d < 1 || d > 365)
        {
            System.out.print("Enter number of day ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            d = sc.nextInt();
            if (d <= 0 || d > 365) System.out.print("Incorrect enter");
        }


        if (d >= 1 && d <= 31) System.out.print(d + " January");
        if (d >= 32 && d <= 59) System.out.print((d - 31) + "February");
        if (d >= 60 && d <= 90) System.out.print((d - 60) + "March");
        if (d >= 91 && d <= 120) System.out.print((d - 91) + "April");
        if (d >= 121 && d <= 151) System.out.print((d - 121) + "May");
        if (d >= 152 && d <= 181) System.out.print((d - 152) + "June");
        if (d >= 182 && d <= 212) System.out.print((d - 182) + "July");
        if (d >= 213 && d <= 243) System.out.print((d - 213) + "August");
        if (d >= 244 && d <= 273) System.out.print((d - 244) + "September");
        if (d >= 274 && d <= 304) System.out.print((d - 274) + "October");
        if (d >= 305 && d <= 334) System.out.print((d - 305) + "November");
        if (d >= 335 && d <= 365) System.out.print((d - 335) + "December");
    }

    static void task36()
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter number of day ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            double x = sc.nextInt();
            double y;
            if (x > 3) y = 1 / (pow(x,3) + 6);
            else y = pow(x,2) - 3 * x + 9;
            System.out.print("y = " + y);
        }
    }

    static void task37()
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter number of day ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            double x = sc.nextInt();
            double y;
            if (x < 3) y = 1 / (pow(x,3) - 6);
            else y = -pow(x,2) + 3 * x + 9;
            System.out.print("y = " + y);
        }
    }

    static void task38()
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter number of day ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            double x = sc.nextInt();
            double y;
            if (x > 3 || x < 0) y = pow(x,2);
            else y = 4;
            System.out.print("y = " + y);
        }
    }

    static void task39()
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter number of day ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            double x = sc.nextInt();
            double y;
            if (x < 8) y = 1 / (pow(x,4) - 6);
            else y = -pow(x,2) + x + 9;
            System.out.print("y = " + y);
        }
    }

    static void task40()
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter number of day ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            double x = sc.nextInt();
            double y;
            if (x > 13) y = - 3 / (x + 1);
            else y = -pow(x,3) + 9;
            System.out.print("y = " + y);
        }
    }



}
