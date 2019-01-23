import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] grad1 = {9,10,5,6,7};
        Student st1 = new Student("Поляков А.В.", 614301, grad1);
        int[] grad2 = {9,10,5,6,7};
        Student st2 = new Student("Петров А.А.", 254689, grad2);
        int[] grad3 = {9,10,9,10,10};
        Student st3 = new Student("Иванов В.В.", 245364, grad3);
        int[] grad4 = {9,10,5,6,7};
        Student st4 = new Student("Огурцов О.О.", 545615, grad4);
        int[] grad5 = {9,10,5,6,7};
        Student st5 = new Student("Мингор М.М.", 154124, grad5);
        int[] grad6 = {9,10,5,6,7};
        Student st6 = new Student("Верхов В.В.", 979456, grad6);
        int[] grad7 = {9,10,10,10,10};
        Student st7 = new Student("Чебрецов Ч.Ч.", 753123, grad7);
        int[] grad8 = {9,10,5,6,7};
        Student st8 = new Student("Терпович Т.Т.", 951123, grad8);
        int[] grad9 = {9,10,5,6,7};
        Student st9 = new Student("Стул С.С.", 123789, grad9);
        int[] grad10 = {10,10,10,10,10};
        Student st10 = new Student("Карноплич К.К.", 123753, grad10);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);
        students.add(st9);
        students.add(st10);

        Student s;

        for (int i = 0; i < students.size(); i++)
        {
            s = students.get(i);
            if (searchStudent(s.getGrad()))
                System.out.println(s.getFio() + "\t" + s.getGroupNumber());
        }
    }

    public static boolean searchStudent(int[] grad)
    {
        boolean trigger = false;
        for (int i = 0; i < grad.length; i++)
        {
            if (grad[i] >= 9 && grad[i] <= 10) trigger = true;
            else trigger = false;
        }
        return trigger;
    }
}
