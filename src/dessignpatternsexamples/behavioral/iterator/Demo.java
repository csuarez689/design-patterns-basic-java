/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void iterate(Iterator iterator) {
        System.out.println("########################");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>(Arrays.asList("BMW", "MERCEDES", "OPEL"));
        List<String> linkList = new LinkedList<>(Arrays.asList("FIAT", "CHEVROLET", "PEUGEOT"));
        Set<String> hashSet = new HashSet<>(Arrays.asList("VOLVO", "MAZDA", "AUDI"));

        Iterator<String> iterator1 = arrList.iterator();
        Iterator<String> iterator2 = linkList.iterator();
        Iterator<String> iterator3 = hashSet.iterator();

        iterate(iterator1);
        iterate(iterator2);
        iterate(iterator3);

    }

}
