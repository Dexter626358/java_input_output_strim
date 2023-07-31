package org.example;

/**
 * Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
 */

public class Main {
    public static void main(String[] args) {
       String directoryPath = ".idea";
       String backupPath = "./backup";
       Backupcreator.createBackup(directoryPath, backupPath);
    }
}