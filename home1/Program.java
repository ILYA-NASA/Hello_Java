package home1;

public class Program {

    // 1 Выбросить случайное целое число и сохранить в i
    public static int randomNum(int min, int max) {
        int number = (int) (Math.random() * ((max - min) + 1)) + min;
        return number;
    }

    // 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int seniorBit(int i) {
        int binLen = Integer.toBinaryString(i).length();        
        return binLen;
    }

    public static void main(String[] args) {
        int i = randomNum(1, 10000);
        System.out.println("integer between 1 and 10000: i = " + i);
        int n = seniorBit(i);
        System.out.println("number of the senior bit from i: n = " + n);
    }

}

// 3 Найти все кратные n числа большие i и сохранить в массив m1
// 4 Найти все некратные n числа меньшие i и сохранить в массив m2
// 5 Сохранить оба массива в файлы с именами m1 и m2 соответственно.

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// **Реализовать один из пунктов рекурсией