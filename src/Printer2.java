

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 *
 * Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
 *
 * Метод divisionByZero - Деление на 0
 *
 * Метод numberFormatException - Ошибка преобразования строки в число
 *
 * Важно: они не должны принимать никаких аргументов
 */

class Answer2 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
int [] array = {0,1,2,3,4,5};
        System.out.println(array[6]);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
int a=4/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int a= Integer.parseInt("q");


    }
}

public class Printer2 {
    public static void main(String[] args) {
        Answer2 ans = new Answer2();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
