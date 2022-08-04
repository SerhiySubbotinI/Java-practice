package ua.javaPractice.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeSet;

public class HW1 {
    public static void main(String[] args) throws IOException {
        String textFromFile = Files.readString(Paths.get("src/main/Text2.txt"));
        long sizeInBytes = textFromFile.getBytes().length;
        int count = 0;
        TreeSet<String> words = new TreeSet<>();
        for (String word : textFromFile.toLowerCase().split("[^A-Za-zА-Яа-я]")) {
            if (word.length() > 5) {
                count++;
                words.add(word);
            }
        }
        System.out.printf("File size = %.6f Mb \n", (float) sizeInBytes / (1024 * 1024));
        System.out.printf("Words in file = %d \n", count);
        System.out.printf("All words in alphabetical order that are longer than 5 characters = %d \n", words.size());
        System.out.println(words);
    }
}


