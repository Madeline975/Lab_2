import java.util.Random;
class Sklad {

    static int N = 10;
    private int count;

    public Sklad() {
        this.count = 0;
    }

    synchronized void putItem() {
        if (count < N) {
            count++;
        }
        long delay = new Random().nextInt(900);
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    synchronized void getItem() {
        if (count > 0) {
            count--;
        }
        long delay = new Random().nextInt(900);
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public int getCount() {
        return count;
    }

}