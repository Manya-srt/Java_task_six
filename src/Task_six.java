import java.util.Scanner; // импорт сканера

public class Task_six{
    public static void main(String args[]){
        System.out.println("Введите число от 1 до 10");
        Scanner scan = new Scanner(System.in);
        int T, X, Y, Z;
        T = scan.nextInt(); // ввод числа с клавиатуры
        X = 2;//
        Y = 9;//константы
        Z = 5;//
        // сравнение введенного значения со значением констант
        if (T == X)
            System.out.println ("Данное значение имеется в константах");
        else if (T == Y)
            System.out.println ("Данное значение имеется в константах");
        else if (T == Z)
            System.out.println ("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}