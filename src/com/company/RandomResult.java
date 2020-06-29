package com.company;

import java.util.Random;

public interface RandomResult {

    static Integer randomResultInteger(Integer[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }

    static String randomResultString(String[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }

    static Double randomResultDouble(Double[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }


}
