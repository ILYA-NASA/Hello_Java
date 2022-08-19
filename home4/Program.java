package home4;

import java.util.LinkedList;
import java.util.List;

public class Program {
    // 1. Объявить и инициализировать связанный список в 10000 элементов случайным
    // числом от -1024 до 1024
    public static List randomLinkedList(int max, int min) {
        List<Integer> randList = new LinkedList<>();
        while (randList.size() <= 10_000) {
            randList.add((int) (Math.random() * ((max - min) + 1)) + min);
        }
        return randList;
    }
    
    public static void main(String[] args) {
        // 1
        int max = 1024, min = -1024;
        System.out.println(randomLinkedList(max, min));
    }



    // 2. Пройти по списку и удалить все отрицательные элементы
    // 3. Скопировать в переменные и удалить из списка первый и второй элементы,
    // сложить переменные, результат сохранить в начало списка.
    // 4. Реализовать пункт №3 для всего списка.
    // 5. Измерить время исполнения пунктов №2 и №3.
    // 6. *Реализовать пункты с первого по пятый но с ArrayList. Сравнить время
    // исполнения.
    // 7. **Оптимизировать реализацию заданий так, чтобы время выполнения LinkedList
    // и ArrayList были наименьшим.
}
