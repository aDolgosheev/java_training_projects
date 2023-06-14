import java.io.*;

public class MainStreams {

    public static void main(String[] args) {
//        String text = "Hello, world!";
//        //Запись
//        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
//            byte[] bytes = text.getBytes();
//            fos.write(bytes, 0, bytes.length);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


//        //Чтение
//        //откроем байтовый поток для чтения файла
//        try (FileInputStream fin = new FileInputStream("notes.txt")) {
//            int i;
//            //считываем файл пока есть доступные байты
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


//        //try with many resources
//        try (FileInputStream fin = new FileInputStream("Notes.txt");
//             FileOutputStream fos = new FileOutputStream("new_notes.txt")) {
//            //work with files
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        //Buffered input / Чтение из файла большого размера
//        String text = "Hello, world!";
//        byte[] buffer = text.getBytes();
//        // создаем входной базовый поток
//        // и передаем его во входной буферизированный поток
//        try (ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//             BufferedInputStream bis = new BufferedInputStream(in)) {
//            int c;
//            while ((c = bis.read()) != -1) {
//                System.out.println((char) c);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


//        // Symbol write
//        String text = "Hello, world!";
//        try (FileWriter writer = new FileWriter("notes.txt", false)) {
//            // запись всей строки
//            writer.write(text);
//            // запись по символам
//            writer.append('\n');
//            writer.append('!');
//            // дозаписываем и очищаем буфер
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


        // Symbol read
        try (FileReader reader = new FileReader("notes.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
