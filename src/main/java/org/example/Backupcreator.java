package org.example;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class Backupcreator {

    public static void createBackup(String directoryPath, String backupPath){
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()){
            System.out.println("Указанная директория не существует");
            return;

        }
        File backupDirectory = new File(backupPath);
        if (!backupDirectory.exists()){
            backupDirectory.mkdir();
        }
        File[] files = directory.listFiles();
        if (files != null){
            for (File file: files){
                if (file.isFile()) {
                    try {
                        Files.copy(file.toPath(), (new File(backupPath, file.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Скопирован файл: " + file.getName());
                    } catch (IOException e) {
                        System.out.println("Ошибка при копировании файла: " + file.getName());
                        e.printStackTrace();
                    }

                }
            }
            System.out.println("Создана резервная копия всех файлов в директории: " + backupPath);
        }

    }
}
