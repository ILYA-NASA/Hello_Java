package home2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    // 1 Напишите программу на Java, чтобы найти наименьшее окно в строке,
    // содержащей все символы другой строки
    public static void minWindow(String firstText, String secondText) {
        Pattern pattern = Pattern.compile(secondText);
        Matcher matcher = pattern.matcher(firstText);
        while (matcher.find()) {
            System.out.println(firstText.substring(matcher.start(), matcher.end()));
        }
        // через регулярные выражения находим все полные совпадения текста второй строки
        // с первой.
        // после семинара появилось впечатление что все окна одинаковые, а значит -
        // наименьшие.
        // работает на латинице
    }

    // 2 Напишите программу на Java, чтобы проверить, являются ли две данные строки
    // вращением друг друга.
    public static boolean searchPalindrom(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }
    
    // 3 *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
    public static String reverseStr(String str) {
        if (str.length() <= 1) {
           return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String str1 = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String str2 = iScanner.nextLine();
        iScanner.close();

        // 1
        System.out.println("Ниже все наименьшие окна первой строки, содержащие все символы второй строки");
        minWindow(str1, str2);
        System.out.println();

        // 2
        if (searchPalindrom(str1, str2)) {
            System.out.println("Введенные вами строки являются вращением друг друга");
        } else
            System.out.println("Введенные вами строки НЕ являются вращением друг друга");

        // 3
        System.out.printf("Переворачиваем первую строку: %s\n", reverseStr(str1));
        System.out.printf("Переворачиваем вторую строку: %s", reverseStr(str2));
    }

    // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168
    // Используем метод StringBuilder.append().
    // 5 Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.insert(),
    // StringBuilder.deleteCharAt().
    // 6 *Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.replace().
    // 7 **Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов
    // "="
    // средствами String и StringBuilder.
}
