package home6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        // 1.
        System.out.println("1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts:");
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();
        System.out.println(hs + " - HashSet (hs)\n" + lhs + " - LinkedHashSet (lhs)\n" + ts + " - TreeSet (ts)");
        // 2.
        System.out.println("\n2. Добавить в множества по 10 случайных целочисленных ключей:");
        hs.addAll(rndmList());
        lhs.addAll(rndmList());
        ts.addAll(rndmList());
        System.out.println("hs: " + hs + "\nlhs: " + lhs + "\nts: " + ts);
        // 3.
        System.out.println(
                "\n3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs:");
        System.out.println("hs: " + removeElementSet(hs, lhs));
        // 3.
        System.out.println(
                "\n4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts:");
        System.out.println("lhs: " + addElementSet(lhs, ts));
    }

    // 2.
    private static List<Integer> rndmList() {
        List<Integer> rndList = new ArrayList<>();
        while (rndList.size() < 10) {
            rndList.add((int) (Math.random() * 100));
        }
        return rndList;
    }

    // 3.
    private static Set<Integer> removeElementSet(Set<Integer> hs, Set<Integer> lhs) {
        hs.removeAll(lhs);
        return hs;
    }

    // 4.
    private static Set<Integer> addElementSet(Set<Integer> lhs, Set<Integer> ts) {
        lhs.addAll(ts);
        return lhs;
    }

    // 5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer
    // (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1
    // 15 случайными числами и вывести на печать.
    // 6. *Объявить и инициализировать множество TreeMap tm с компаратором Integer
    // (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить
    // tm 15 случайными числами и вывести на печать.
}
