import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // گرفتن ورودی عدد
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // آرایه برای ذخیره جدول ضرب
        int[] table = new int[10];

        // محاسبه جدول ضرب
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // نمایش جدول ضرب
        System.out.println("\nMultiplication Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}