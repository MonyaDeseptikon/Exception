package ExceptionAdvanced;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IOFile {
    public static void writeToFile(String[] data) {

        String path = new String("src/ExceptionAdvanced/" + data[0] + ".txt");
        File file = new File(path);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String element : data) {
                bufferedWriter.write("<"+ element+ "> ");
            }

            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
