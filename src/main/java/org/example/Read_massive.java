package org.example;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_massive {

    public static int[] reader(String file) {
        int[] array = new int[9];
        final int DIGIT_BOUND = 48;


        try (FileInputStream fis = new FileInputStream(file)) {
            int i = 0;
            int b;
            fis.read(); // [
            while (true) {
                if ((b = fis.read()) == -1) break;
                array[i] = b - DIGIT_BOUND;
                fis.read(); // ,
                i++;
                }
            fis.read(); // ]
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return array;
    }
}


