public class PrintThread implements Runnable {

    private String message;

    PrintThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (this){
            for(int i = 0; i < message.length(); i++){
                System.out.print(message.charAt(i));
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}
