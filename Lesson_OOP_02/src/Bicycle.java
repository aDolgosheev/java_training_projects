public class Bicycle implements Transferer {

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " прокатился на велосипеде из " + from + " в " + to);
    }
}
