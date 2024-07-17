package multiThreadingConcept;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

//        for (int i = 0; i < 1000; i++) {
//
//            System.out.printf("%d* ", i);
//        }
//
//        System.out.println("\n * task completed");
//
//        for (int i = 0; i < 1000; i++) {
//
//            System.out.printf("%d# ", i);
//        }
//
//        System.out.println("\n # task completed");
//
//        for (int i = 0; i < 1000; i++) {
//
//            System.out.printf("%d$ ", i);
//        }
//
//        System.out.println("\n $ task completed");

//         Create threads

        FirstTask f1 = new FirstTask();
        f1.setPriority(Thread.MAX_PRIORITY);
        SecondTask f2 = new SecondTask();
        ThirdTask f3 = new ThirdTask();

        System.out.println("Starting first Thread");
        f1.start();
        System.out.println("Starting second Thread");
        f2.start();
        f1.join();
        System.out.println("Starting third Thread");
        f3.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("Total time taken :  %d", (endTime - startTime));
    }
}