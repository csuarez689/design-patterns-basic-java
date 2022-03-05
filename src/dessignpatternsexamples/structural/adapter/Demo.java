/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.adapter;

import java.util.Arrays;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        int[] numbers = new int[]{34, 2, 4, 12, 1};

        //NumberSorter ns = new NumberSorter();
        //ns.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        ISorter sorter = new SorterListAdapter();
        numbers = sorter.sort(numbers);

        System.out.println(Arrays.toString(numbers));

    }
}
