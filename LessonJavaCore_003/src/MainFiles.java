import java.io.File;
import java.io.IOException;

public class MainFiles {

    public static void main(String[] args) throws IOException {
        File newFile = new File(".", "text.txt");

        System.out.println("File name: " + newFile.getName());
        System.out.println("Main catalogue: " + newFile.getParent());
        System.out.println("File size: " + newFile.length());


        if (newFile.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File was not found");
        }

        if (newFile.canRead()) {
            System.out.println("File can be read");
        } else {
            System.out.println("File can't be read");
        }

        if (newFile.canWrite()) {
            System.out.println("File can be written");
        } else {
            System.out.println("File can't be written");
        }
    }
}
