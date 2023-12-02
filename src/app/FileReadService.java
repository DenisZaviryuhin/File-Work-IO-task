package app;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class FileReadService {
    public String readFile(String file) {
        try {
            final BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(Constants.BASE_PATH_IN + file),
                            StandardCharsets.UTF_8

                    )

            );
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }

        } catch (IOException exception) {

            return exception.getMessage();

        }
        return "---------------" + "\nReading successfully completed!";
    }
}




