package com.tms.olnandtaa1.lesson12.task1;

import javax.management.MBeanConstructorInfo;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/olnandtaa/Desktop/teachmeskills/file/DocNumbers.txt");
        File file2 = new File("/Users/olnandtaa/Desktop/teachmeskills/file/", "ValidDocs.txt");
        File file3 = new File("/Users/olnandtaa/Desktop/teachmeskills/file/", "NotValidDocs.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String[] str = new String[10];
            for (int i = 0; i < str.length; i++) {
                str[i] = reader.readLine();
                System.out.println(str[i]);
            }

            File fileToWrite = new File("/Users/olnandtaa/Desktop/teachmeskills/file/", "outputText.txt");
            FileWriter fileWriter = new FileWriter(fileToWrite);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int i = 0; i < str.length; i++) {
                writer.write(str[i]);
                writer.newLine();

            }
            writer.close();
            FileWriter fileWriter1 = new FileWriter(file2);
            BufferedWriter writer1 = new BufferedWriter(fileWriter1);
            FileWriter fileWriter2 = new FileWriter(file3);
            BufferedWriter writer2 = new BufferedWriter(fileWriter2);
            for (int i = 0; i < str.length; i++) {
                if (str[i].length() == 15) {
                    writer1.write(str[i]);
                    writer1.newLine();
                } else {
                    writer2.write(str[i]);
                    writer2.newLine();

                }

            }
            writer1.close();
            writer2.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
