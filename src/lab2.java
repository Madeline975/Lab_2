import java.util.Random;

public class lab2 {

    public static void main(String[] args) {

        final Sklad sklad = new Sklad();
        Thread producer = new Thread() {
            public void run() {
                sklad.putItem();
                int count = sklad.getCount();
                System.out.println("producer new item; total = " + count);
            }
        };
        Thread consumer = new Thread() {
            public void run() {
                sklad.getItem();
                int count = sklad.getCount();
                System.out.println("consumer item; total = " + count);
            }
        };

        producer.run();
        consumer.run();
    }

}