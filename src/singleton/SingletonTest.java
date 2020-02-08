package src.singleton;

public class SingletonTest extends Thread {
    String myID;
    public SingletonTest(String assignedID) {
        this.myID = assignedID;
    }

    public void run() {
        Singleton singleton = Singleton.getInstance();
        if (singleton != null) {
            System.out.println(this.myID + " get Singleton instance: " + singleton.hashCode());
        }
    }

    public static void main(String[] args) {
        // Under single thread
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Under single thread");
        System.out.println("singleton1: " + singleton1.hashCode());
        System.out.println("singleton2: " + singleton2.hashCode());
        System.out.println();

        // Under multiple threads
        Thread thread1 = new SingletonTest("thread1");
        Thread thread2 = new SingletonTest("thread2");
        System.out.println("Under multiple threads");
        thread1.start();
        thread2.start();
    }
}
