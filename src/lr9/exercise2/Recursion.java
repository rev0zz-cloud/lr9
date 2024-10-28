/*2. Создать приложение с использованием рекурсии для перевода целого числа,
введенного с клавиатуры, в двоичную систему счисления.*/
package lr9.exercise2;

import java.util.Scanner;
public class Recursion {

    public static void m(int x) {
        if (x < 2) {
        } else {
            m(x / 2);
        }
        System.out.print(x % 2);
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите число которое хотите перевести в двоичное: ");
            int  c =  scanner.nextInt();
            m(c);
            scanner.close();
        }
}