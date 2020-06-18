package com.company;

import java.util.Random;

public interface RandomResult {

    static Integer randomResult(Integer[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }

}
