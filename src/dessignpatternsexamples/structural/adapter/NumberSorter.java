/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.adapter;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class NumberSorter {

    public List<Integer> sortList(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
}
