package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {

    public void firstTask () {
        int[] numbers = {1,2,3,4,5,6,7};

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] == 5) {
                break;
            }
            else {
                System.out.println(numbers[i]);
            }
        }
    }

    public void secondTask () {
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Pasha","Marina", "Artyom", "Misha", "Sasha", "Syusen", "Ksenia", "Viktor", "Vladimir", "Dima"));

        for (String s: names) {
            System.out.println(s);
        }
    }
}
