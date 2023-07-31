package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write_massive {
    public static void writer(String file, int[] array){

        final int DIGIT_BOUND = 48;
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write('[');
            for (int i = 0; i < array.length; i++) {
                fos.write(DIGIT_BOUND + array[i]);
                if (i < array.length - 1) fos.write(',');
            }
            fos.write(']');
            fos.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
