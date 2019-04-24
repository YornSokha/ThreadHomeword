public class Main {
    public static void main(String[] args) {
        String[] messages = {"Hello KSHRD!", "*********************************",
                             "I love Java programming!", "---------------------------------",
                             "........Complete 100%"};
        Thread thread;
        for (int i = 0; i < messages.length; i++) {
            if (i == 4) {
                System.out.print("Downloading");
            }
            thread = new Thread(new PrintThread(messages[i]));
            start(thread);
        }
    }

    private static void start(Thread thread) {
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
