package app;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
   public  String writeFile(String myText, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(Constants.BASE_PATH_IN + fileName)) {
            byte[] array = myText.getBytes();
            fileOutputStream.write(array, 0, array.length);


        } catch (IOException exception) {
            return exception.getMessage();
        }

        return "All done!";
    }


}
