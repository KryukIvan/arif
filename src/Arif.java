import java.util.Scanner;

public class Arif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое дробное число: ");
        int x = in.nextInt();
        float a = x;

        System.out.print("Введите второе дробное число: ");
        int y = in.nextInt();
        float b = y;

        System.out.print("Введите третье дробное число: ");
        int z = in.nextInt();
        float c = z;

        float summ = (a + b + c)/3;
        System.out.printf("Среднее арифметическое трех чисел: %.2f \n", summ);
        in.close();

        double deci = Math.floor(summ/2);
       // System.out.println(deci);

        if (deci > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
