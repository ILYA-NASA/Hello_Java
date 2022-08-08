package home1;

public class Program {

    // 1 Выбросить случайное целое число и сохранить в i
    public static int randomNum(int min, int max) {
        int num = (int) (Math.random() * ((max - min) + 1)) + min;
        return num;
    }

    // 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int seniorBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;
    }

    // 3 Найти все кратные n числа большие i и сохранить в массив m1
    public static int[] arrayMult(int i, int n, int max) {
        int arrLen = ((int) (max / n)) - ((int) (i / n)); //определяю длину массива
        int[] arr = new int[arrLen];
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0){
                return arr[j]; //осталось вспомнить как заполнять и выводить массив в консоль 
            }
        }
    }

    public static void main(String[] args) {
        int min = 1, max = 10_000;
        int i = randomNum(min, max);
        System.out.println("integer between " + min + " and " + max + ": i = " + i);
        int n = seniorBit(i);
        System.out.println("number of the senior bit from i: n = " + n);
        int[] m1 = arrayMult(i, n, max);
        System.out.print("array multiple n > i: " + m1 );
    }

}

// 4 Найти все некратные n числа меньшие i и сохранить в массив m2
// 5 Сохранить оба массива в файлы с именами m1 и m2 соответственно.

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// **Реализовать один из пунктов рекурсией