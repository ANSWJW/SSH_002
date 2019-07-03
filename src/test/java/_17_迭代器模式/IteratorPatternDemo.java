package _17_迭代器模式;

import _17_迭代器模式.api.Iterator;
import _17_迭代器模式.imp.NameRepository;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator();iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("name: "+name);
        }
    }
}
