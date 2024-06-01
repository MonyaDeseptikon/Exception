package ExceptionAdvanced;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IOUser {
    private int dataLenght = 6;

    public String[] inputData() {
        System.out.println("Введите данные через пробел в следующем формате:\n" +
                "фамилия, имя, отчество - строки\n" +
                "дата _ рождения - строка формата dd.mm.yyyy\n" +
                "номер _ телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.");
String [] result = checkCount(input());
        checkElements(result);
        return result;
    }

    private String input() {
        Scanner data = new Scanner(System.in);
        String string = data.nextLine();
        data.close();
        return string;
    }

    private String[] checkCount(String input) {

        String string[] = input.split(" ");
        if (string.length != dataLenght) throw new RuntimeException("Вы ввели неверное количество данных");
        return string;
    }

    private void checkElements(String[] data) {
        if (!data[0].matches("[a-zA-Z]+") | !data[1].matches("[a-zA-Z]+") | !data[2].matches("[a-zA-Z]+")) {
            throw new RuntimeException("ФИО может содержать только алфавитные символы");
        }
        try {
            Date date = new SimpleDateFormat("dd.mm.yyyy").parse(data[3]);
        } catch (ParseException e) {
            throw new RuntimeException("Вы ввели неверный формат даты");
        }
        try{
            Integer.parseInt(data[4]);
        }catch (NumberFormatException e){
            throw new RuntimeException("Номер телефона может содержать только целые числа");
                   }
        if (!data[5].matches("[fFmM]")) {
            throw new RuntimeException("Пол может содержать только символы f или m");
        }
    }

}
