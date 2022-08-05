package ua.javaPractice.task0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlexHW1 {
    public static void main(String[] args) {
        var path = "src/main/Text2.txt";

        try {
            var filePath = Path.of(path);
            var sizeInMb = Double.valueOf(Files.size(filePath)) / (1024 * 1024);
            var content = Files.readString(filePath);
            var longWordsListSorted = Stream.of(content.split("[.,()\\[\\] \" \\?!: '\\n]"))
                    .filter(s -> s.length() > 5)
                    .map(String::toLowerCase)
                    .collect(Collectors.toCollection(TreeSet::new));

            System.out.printf("File size: %.5f Mb \n", sizeInMb);
            System.out.printf("Words count: %d \n", longWordsListSorted.size());
            System.out.printf("Sorted words: %s \n", String.join(", ", longWordsListSorted));

        } catch (IOException e) {
            System.out.printf(
                    "ERROR - Failed to read file path: %s. Error message: %s",
                    path, e.getLocalizedMessage()
            );
        }
    }
}
