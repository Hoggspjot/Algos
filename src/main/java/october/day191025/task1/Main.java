package october.day191025.task1;

public class Main {
    public static void main(String[] args) {
        Thread h = new Thread(new Hello());
        h.start();
    }
}

class Hello implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}