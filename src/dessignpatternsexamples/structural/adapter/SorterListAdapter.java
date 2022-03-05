/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.adapter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 *
 * @author Claudio
 */
public class SorterListAdapter implements ISorter {

    private NumberSorter numberSorter;

    public SorterListAdapter() {
        numberSorter = new NumberSorter();
    }

    @Override
    public int[] sort(int[] numbers) {
        List<Integer> integers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        numberSorter.sortList(integers);
        return integers.stream().mapToInt(i -> i).toArray();
    }
}
