package org.example;

import java.util.Arrays;

/*
Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
 где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
  Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
   Записать в файл состояние поля и добавить возможность восстановить состояние поля из файла (*)
    сделать доп возможность в игре крестики-нолики - метод для сохранения состояния игры и восстановление из файла
 */
public class Main {
    public static void main(String[] args) {
        int[] score = {0, 1, 2, 3, 0, 1, 2, 3, 0};
        Write_massive.writer("resultofgame.txt", score);
        System.out.println("Результат игры сохранен в файл: resultofgame.txt");
        System.out.println(Arrays.toString(score));
        int[] game = Read_massive.reader("resultofgame.txt");
        System.out.println("Восстановлено состаяние игры. Данные считаны из файла:resultofgame.txt");
        System.out.println(Arrays.toString(game));

    }
}