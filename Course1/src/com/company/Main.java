package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;
import static java.lang.Math.*;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

    task37();

    }

    static void task1()
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter x ->");
       while(!sc.hasNextDouble())
       {
           System.out.print("->");
           sc.next();
       }
       double x = sc.nextDouble();

       System.out.print("Enter y ->");
       while(!sc.hasNextDouble())
       {
           System.out.print("->");
           sc.next();
       }
       double y = sc.nextDouble();

       System.out.println("Sum: " + (x + y) + " Dif: " + (x - y) + " Quot: " + (x / y) + " Comp: " + (x * y));
    }

    static void task2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();
        int a = 3 + c;
        System.out.print("A = " + a);
    }

    static  void task3()
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

        int z = 2 * x + (y - 2) * 5;
        System.out.print("Z = " + z);
    }

    static void task4()
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c, z;
        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        a = sc.nextInt();

        System.out.print("Enter b ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        b = sc.nextInt();

        System.out.print("Enter c ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        c = sc.nextInt();

        z = ((a - 3) * b / 2) + c;
        System.out.print("Z = " + z);
    }

    static void task5()
    {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.print("Enter count of numbers ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int i = sc.nextInt();

        int m[] = new int[i];
        for (int a = 0; a < m.length; a++) {
            System.out.print("Enter [" + i + "] number -> ");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            m[a] = sc.nextInt();
        }

        for (int a = 0; a < m.length; a++)
        {
            c = c + m[a];
        }
        System.out.print("Average: " + (c / i));
    }

    static void task6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of can (> 0) ->");
        int n = 0;

        while (n <= 0)
        {
            System.out.print("Count can`t be less then 1, enter right count ->");
            while(!sc.hasNextInt())
            {
                System.out.print("->");
                sc.next();
            }
            n = sc.nextInt();
        }

        double n1 = 80 / n;
        n1 = (n1 + 12) * n;
        System.out.print("Result: " + n1);
    }

    static void task7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bigger side of rectangle ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double a = sc.nextDouble();
        double b = a / 2;
        System.out.print("Square: " + (a * b));
    }

    static void task8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rez = ((b + sqrt(pow(b,2) + 4 * a * c) / (2 * a)) - pow(a,3) * c + pow(b,-2));
        System.out.print("Result: " + rez);
    }

    static void task9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c, d ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double rez = (((a / c) * (b / d)) - ((a * b - c) / (c * d)));
        System.out.print("Result: " + rez);
    }

    static void task10()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x, y ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double rez = (((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y));
        System.out.print("Result: " + rez);
    }

    static void task11()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter legs a, b ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sqrt(pow(a,2) + pow(b,2));
        double p = a + b + c;
        double s = a * b / 2;
        System.out.print(a + ", " + b + ", " + c);
        System.out.print(" P = " + p);
        System.out.print(" S = " + s);
    }

    static void task12()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double d = sqrt(pow(x2 - x1,2) + pow((y2 - y1),2));
        System.out.print("Distance-> " + d);
    }

    static void task13()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double d1 = sqrt(pow(x2 - x1,2) + pow((y2 - y1),2));
        double d2 = sqrt(pow(x3 - x1,2) + pow((y3 - y1),2));
        double d3 = sqrt(pow(x3 - x2,2) + pow((y3 - y2),2));
        double p = d1 + d2 + d3;

        System.out.print("P-> " + p);
        System.out.print("S->" + sqrt(p * (p - d1) * (p - d2) * (p - d3)));
    }

    static void task14()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int r = sc.nextInt();
        System.out.print("S->" + (3.14 * pow(r,2)) + " C->" + (3.14 * 2 * r));
    }

    static void task15()
    {
        double pi = Math.PI;
        System.out.print("Pi = " + pi + " Pi^2 = " + pow(pi,2) + " Pi^3 = " + pow(pi,3) + " Pi^4 = " + pow(pi,4));
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
        int x1 = sc.nextInt();

        int mas[] = new int[4];
        String str;

        str = Integer.toString(x1);
        char[] chStr = str.toCharArray();

        for(int i = 0; i < chStr.length; i++)
        {
            //System.out.print(chStr[i]);
            mas[i] = parseInt(chStr[i] + "");
        }
        //после этого массив заполнен цифрами

        int x = 1;
        for (int i = 0; i < mas.length; i++)
        {
            x = x * mas[i];
        }
        System.out.print(x);
    }

    static void task17()
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

        double xy, qxy;

        xy = (pow(x,3) + pow(y,3)) / 2;
        qxy = cbrt(abs(x) * abs(y));

        System.out.print("Average = " + xy + "Geometric = " + qxy);
    }

    static void task18()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cube edge ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("S face of the cube = " + pow(a,2) + " Full S = " + (pow(a,2) * 6) + " V of cube = " + pow(a,3));
    }

    static void task19()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the triangle ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("S = " + (pow(a,2) * sqrt(3) / 4) + " h = " + (a * sqrt(3)) + " Rv = " + ((pow(a,2) * sqrt(3) / 4) / (0.5 * 3 * a))
                + " Ro = " + (a / sqrt(3)));
    }

    static void task20()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circumference ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int c = sc.nextInt();

        double r = c / (2 * PI);

        System.out.print("S circle = " + (PI * pow(r,2)));
    }

    static void task21()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x(nnn.ddd) ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double x = sc.nextDouble();

        double a = (int)x % 1000;
        int b = (int)((x - a) * 1000);
        System.out.print(x + "___________" + a + "_________" + b);
        double a1 = a / 1000;
        double xn = b + a / 1000;
        System.out.print("_________" + xn);
    }

    static void task22()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int s = sc.nextInt();
        int h = s / 3600;
        int m = (s / 60) - h;
        int s1 = (m * 60) - s;

        System.out.print(h + "ч " + m + "мин " + s1 + "с");
    }
    static void task23()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int r = sc.nextInt();

        System.out.print("Enter R ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int R = sc.nextInt();

        System.out.print("S = " + ((PI * pow(R,2)) - PI * (pow(r,2))));
    }

    static void task24()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Enter r ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Enter al ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int al = sc.nextInt();

        double h = (b - a) / 2 * sin(al);


        double s = (a + b) / 2 * h;

        System.out.print("S trap = " + s);
    }

    static void task25()
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (a == 0)
        {
            System.out.print("Enter a!=0 ->");
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            a = sc.nextInt();
        }

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

        double D = pow(b,2) - (4 * a * c);
        double x1 = 0, x2 = 0;
        if (D < 0) System.out.print("D < 0");
        else
        {
            x1 = (-b + sqrt(D)) / (2 * a);
            x2 = (-b - sqrt(D)) / (2 * a);
            if (x1 == x2) System.out.print("x = " + x1);
            else System.out.print("x1 = " + x1 + " x2 = " + x2);
        }
    }

    static void task26()
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

        System.out.print("Enter al ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int al = sc.nextInt();

        System.out.print("S = " + (0.5 * a * b * sin(al)));
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
        int temp = a;

        a = a * a;
        a = a * a;
        a = a * a;

        System.out.print("a^8 = " + a);

        a = temp;

        a = a * a;
        a = a * a;
        a = a * a;
        a = a * temp * temp;

        System.out.print(" a^10 = " + a);
    }

    static void task28()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rad ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double rad = sc.nextDouble();

        double grad = rad * (180 / PI);
        double min = grad * 60;
        double sec = min * 60;

        System.out.print(rad + "radian = " + grad + "grad = " + min + "min = " + sec + "sec");
    }


    static void task29()
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

        double cos_al = (pow(a,2) + pow(b,2) - pow(c,2)) / (2 * a * b);
        double Al = (acos(cos_al)) * 180 / PI;

        double cos_Bt = (pow(a,2) + pow(c,2) - pow(b,2)) / (2 * a * c);
        double Bt = (acos(cos_Bt)) * 180 / PI;

        double Ym = 180 - (Al + Bt);
        System.out.print("Alfa = " + Al + " Betta = " + Bt + " Gamma = " + Ym + " Full = " + (Al + Bt + Ym));

        double AlR = Al * (PI / 180), BtR = Bt * (PI / 180), YmR = Ym * (PI / 180);
        System.out.print("\nAlfa rad = " + AlR + " Betta rad = " + BtR + " Gamma rad = " + YmR);
    }

    static void task30()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R1 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double R1 = sc.nextInt();

        System.out.print("Enter R2 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double R2 = sc.nextInt();

        System.out.print("Enter R3 ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double R3 = sc.nextInt();

        double R12 = R1 * R2, R13 = R1 * R3, R23 = R2 * R3;

        double R = ((R23 + R13 + R12) / (R1 * R2 * R3));

        System.out.print("R = " + R);
    }

    static void task31()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter V of boat ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double v = sc.nextInt();

        System.out.print("Enter V1 of river ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double v1 = sc.nextInt();

        System.out.print("Enter T on river ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double t = sc.nextInt();

        System.out.print("Enter T1 protiv river ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        double t1 = sc.nextInt();

        System.out.print("Distance on stoyachaya river = " );
    }




    static void task33()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter letter ->");

        char a = sc.next().charAt(0);

        int b = valueOf(a);
        char b1 = (char) (b - 1);
        char b2 = (char) (b + 1);
        System.out.println("Actual ->" + b + " Prev ->" + b1 + " Next ->" + b2);
    }

    static void task34()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A bit ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double b = sc.nextDouble();
        double kb = b / 1024;
        double mb = kb / 1024;
        System.out.print(b + " bit = " + kb + "KBit = " + mb + " MBit");
    }

    static void task35()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter M ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double m = sc.nextDouble();

        System.out.print("Enter N ->");
        while(!sc.hasNextDouble())
        {
            System.out.print("->");
            sc.next();
        }
        double n = sc.nextDouble();

        double rez = m / n;
        int a = (int)rez % 10;
        int b = ((int)(rez * 10)) % 10;
        System.out.print("\n" + rez + "___________" + a + "_________" + b);
    }

    static void task36()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number(xxxx) ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        double ch = 1, nch = 1, temp;
        while (x > 0)
        {
            temp = x % 10;
            x = x / 10;
            if ((temp % 2) == 0) ch = ch * temp;
            else nch = nch * temp;
        }

        System.out.print("PCet ->" + ch + " PNchet ->" + nch + " Chasnoe ->" + (double)(ch / nch));
    }

    static void task37()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose \n" +
                "1 - Целое число N является четным двузначным числом\n" +
                "2 - Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.\n" +
                "3 - Сумма цифр данного трехзначного числа N является четным числом.\n" +
                "4 - Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).\n" +
                "5 - Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.\n" +
                "6 - Треугольник со сторонами а,b,с является равнобедренным.\n" +
                "7 - Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.\n" +
                "8 - Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).\n" +
                "9 - График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).\n");

        int x = 0, p = 0;
        while (x != 1)
        {
            while (!sc.hasNextInt()) {
                System.out.print("->");
                sc.next();
            }
            p = sc.nextInt();
            if(p > 0 && p < 10) x = 1;
        }

        switch (p)
        {
            case 1:
                System.out.print("Enter N ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                int n = sc.nextInt();
                if((String.valueOf(Math.abs(n)).length() == 2) && (n % 2 == 0)) System.out.println("True");
                else System.out.println("False");
                break;

            case 2:
                System.out.print("Enter N(xxxx) ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                n = sc.nextInt();
                int a = n % 100;
                int b = n / 100;
                if (a == b) System.out.println("True");
                else System.out.println("False");
                break;

            case 3:

                System.out.print("Enter N(xxx) ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                 x = sc.nextInt();

                int mas[] = new int[3];
                String str;

                str = Integer.toString(x);
                x = 0;
                char[] chStr = str.toCharArray();

                for(int i = 0; i < chStr.length; i++)
                {
                    mas[i] = parseInt(chStr[i] + "");
                }

                for (int i = 0; i < 2; i++)
                {
                    x = x + mas[i];
                }
                if (x % 2 == 0) System.out.println("True");
                else System.out.println("False");
                break;
            case 4:

                System.out.print("Line x1 =");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                int x1 = sc.nextInt();

                System.out.print("Line x2 =");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                int x2 = sc.nextInt();

                System.out.print("Enter x, y ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                x = sc.nextInt();
                int y = sc.nextInt();

                if(y <= x2 && y >= x1) System.out.println("True");
                else System.out.println("False");

                break;
            case 5:

                System.out.print("Enter x(xxx) ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                x = sc.nextInt();


                int masf5[] = new int[2];

                str = Integer.toString(x);
                x1 = 0;
                chStr = str.toCharArray();

                for(int i = 0; i < chStr.length; i++)
                {
                    masf5[i] = parseInt(chStr[i] + "");
                }

                for (int i = 0; i < 2; i++)
                {
                    x1 = x1 + masf5[i];
                }
                if (pow(x1,3) == pow(x,2)) System.out.println("True");
                else System.out.println("False");
                break;
            case 6:

                System.out.print("Enter a ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                a = sc.nextInt();

                System.out.print("Enter b ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                b = sc.nextInt();

                System.out.print("Enter c ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                int c = sc.nextInt();

                if (a == b || a == c || b == c) System.out.println("True");
                else System.out.println("False");
                break;
            case 7:

                System.out.print("Enter x(xxx) ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                x = sc.nextInt();


                int masf7[] = new int[2];

                str = Integer.toString(x);
                chStr = str.toCharArray();

                for(int i = 0; i < chStr.length; i++)
                {
                    masf7[i] = parseInt(chStr[i] + "");
                }

                if (masf7[0] + masf7[1] == masf7[2]) System.out.println("True");
                else System.out.println("False");
                break;
            case 8:
                System.out.print("Enter a ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                a = sc.nextInt();

                System.out.print("Enter N ->");
                while (!sc.hasNextInt()) {
                    System.out.print("->");
                    sc.next();
                }
                n = sc.nextInt();
                if (n % a == 0) System.out.println("True");
                else System.out.println("False");
                break;
            case 9:
                System.out.print("Opyat` matesha(((((");
                break;

        }
    }

    static void task38()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x, y ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = (-4 - x) * (4 - 0) - (0 - -4) * (0 - y);
        int b = (0 - x) * (0 - 4) - (-4 - 4) * (0 - y);
        int c = (4 - x) * (0 - 0) - (-4 - 4) * (0 - y);

        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) System.out.print("Prinadlejit treugolniku");
        else System.out.print("Ne prinadlejit treugolniku");

        if ((x <= 4 && x >= -4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) System.out.print("Prinadlejit bashne");
        else System.out.print("Ne prinadlejit bashne");


        if ((sqrt(pow(x,2) + pow(y,2)) <= 4 && x >= 0 && y >= 0) || (sqrt(pow(x,2) + pow(y,2)) >= -5 && x >= 0 && y <= 0)) System.out.print("Prinadlejit chetvertyam");
        else System.out.print("Ne prinadlejit chetvertyam");
    }

    static void task39()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        int a = 2 * x * x * x * x - 3 * x * x * x + 4 * x * x - 5 * x + 6;

        System.out.print("a = " + a);
    }

    static void task40()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x ->");
        while(!sc.hasNextInt())
        {
            System.out.print("->");
            sc.next();
        }
        int x = sc.nextInt();

        double y = -2 * x + 3 * pow(x,2) - 4 * pow(x,3);
        double y1 = 1 + -2 * x + 3 * pow(x,2) - 4 * pow(x,3);

        System.out.print(y + "\n" + y1);
    }


}

