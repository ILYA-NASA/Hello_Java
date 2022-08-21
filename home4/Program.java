package home4;

import java.util.LinkedList;
import java.util.List;

public class Program {
    // 1. Объявить и инициализировать связанный список в 10000 элементов случайным
    // числом от -1024 до 1024
    public static List<Integer> randomLinkedList(int max, int min, int sizeList) {
        List<Integer> randList = new LinkedList<>();
        while (randList.size() <= sizeList) {
            randList.add((int) (Math.random() * ((max - min) + 1)) + min);
        }
        return randList;
    }

    // 2. Пройти по списку и удалить все отрицательные элементы
    public static List<Integer> removeNegativeElement(List<Integer> list) {
        list.removeIf(s -> s < 0);
        return list;
    }

    // 3. Скопировать в переменные и удалить из списка первый и второй элементы,
    // сложить переменные, результат сохранить в начало списка.
    public static List<Integer> firstPlusSecondElement(List<Integer> list) {
        int fist = list.remove(0); // метод remove возвращает удалнный элемент в перемнную fist
        int second = list.remove(0);
        list.add(0, fist + second);
        return list;
    }

    // 4. Реализовать пункт №3 для всего списка.
    public static List<Integer> sumElementList(List<Integer> list) {
        while (list.size() > 1) {
            firstPlusSecondElement(list);
        }
        return list;
    }

    public static void main(String[] args) {
        // 1
        int max = 1024, min = -1024, sizeList = 10_000;
        List<Integer> randomList = randomLinkedList(max, min, sizeList);
        System.out.println(randomList);

        // 2
        List<Integer> positiveList = removeNegativeElement(randomList);
        System.out.println(positiveList);

        // 3
        List<Integer> updatedList = firstPlusSecondElement(positiveList);
        System.out.println(updatedList);
    
        // 4
        List<Integer> sumList = sumElementList(updatedList);
        System.out.println(sumList);
    }

    // 5. Измерить время исполнения пунктов №2 и №3.
    // 6. *Реализовать пункты с первого по пятый но с ArrayList. Сравнить время
    // исполнения.
    // 7. **Оптимизировать реализацию заданий так, чтобы время выполнения LinkedList
    // и ArrayList были наименьшим.
}
