import java.util.Random;

public class ThreadImpar extends Thread {

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);
            if (number % 2 != 0) {
                System.out.println(number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
