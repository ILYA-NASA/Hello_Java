package home6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        // 1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и
        // TreeSet ts
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();
        System.out.println(hs + " - HashSet (hs)\n" + lhs + " - LinkedHashSet (lhs)\n" + ts + " - TreeSet (ts)");

        // 2. Добавить в множества по 10 случайных целочисленных ключей.
        while (hs.size() < 10) {
            hs.add((int) (Math.random() * 100));
        }
        System.out.println(hs);

        // while (lhs.size() < 10) {
        //     hs.add((int) (Math.random() * 100));
        // }
        // System.out.println(lhs);

        // while (ts.size() < 10) {
        //     hs.add((int) (Math.random() * 100));
        // }
        // System.out.println(ts);
    }

    // 3. Пройти по множеству hs и, при условии наличия соответствующего ключа в
    // множестве lhs, удалить ключ из hs
    // 4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в
    // множестве ts, добавит ключ в ts
    // 5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer
    // (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1
    // 15 случайными числами и вывести на печать.
    // 6. *Объявить и инициализировать множество TreeMap tm с компаратором Integer
    // (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить
    // tm 15 случайными числами и вывести на печать.
}
