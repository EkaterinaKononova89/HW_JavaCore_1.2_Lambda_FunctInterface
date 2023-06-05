public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
//        Worker worker = new Worker(listener);
//        worker.start();

        OnTaskErrorListener error = System.out::println;
        Worker workerError = new Worker(listener, error);
        workerError.start();
    }
}


