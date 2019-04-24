public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new PrintThread("Hello KSHRD!"));
        thread.start();
        thread.join();

        Thread thread1 = new Thread(new PrintThread("*********************************"));
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(new PrintThread("Shut The Fuck Up bro!"));
        thread2.start();
        thread2.join();

        Thread thread3 = new Thread(new PrintThread("---------------------------------"));
        thread3.start();
        thread3.join();

        System.out.print("Downloading");

        Thread thread4 = new Thread(new PrintThread("........Complete 100%"));
        thread4.start();
        thread4.join();
    }
}
