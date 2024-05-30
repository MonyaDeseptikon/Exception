/**
 * Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
 * При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
 * Если b равен нулю, программа должна вернуть результат равный нулю.
 * После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
 * Если аргументы не переданы через командную строку, используйте значения по умолчанию.
 */
class ExprDiv {

    public static double exprDiv(int a, int b) {
        // Введите свое решение ниже
        double result;
        try {
            result = (double) a / b;
            if (Double.isInfinite(result)) throw new ArithmeticException();
        } catch (ArithmeticException e) {
            return 0;
        } finally {
            printSum(a, b);
        }

        return result;
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a + b);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer7 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = ExprDiv.exprDiv(a, b);
        System.out.println(result);
    }
}