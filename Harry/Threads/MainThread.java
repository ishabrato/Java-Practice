import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
class ChildThread implements Runnable {
    private static final Logger logger = Logger.getLogger(ChildThread.class.getName());

    public void run() {
        printChild();
    }
    
    private void printChild() {
        for (int i = 0; i < 10; i++) {
            logger.info("Child 1");
        }
    }
}

class MainThread {
    private static final Logger logger = Logger.getLogger(MainThread.class.getName());

    public static void main(String[] args) {
        ChildThread child1 = new ChildThread();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(child1);
        executor.shutdown();
        for (int i = 0; i < 10; i++) {
            logger.info("main");
        }
    }
}