public class Main {

    private static long start;
    private static long stop;
    private static long timeFor=0;
    private static long timeWhile=0;
    private static long timeDoWhile=0;

    //Class
    public static void main(String[] args) {
        int i=0;
        while (i<5) {

            // Output
            System.out.println("The for " + "loop ran " + forLoop() + "ms.");
            System.out.println("The while " + "loop ran " + whileLoop() + "ms.");
            System.out.println("The while " + "loop ran " + doWhileLoop() + "ms.\n");
            i++;

        }
        System.out.println("Average values:" + "\n" + "for: " + timeFor/i + "; while: " + timeWhile/i + "; do while: " + timeDoWhile/i);
    //
    }

    // forLoop
    private static long forLoop() {
        double calc = 2.0;
        start = System.currentTimeMillis();
        for (int i=0; i<10000000; i++)
            calc = Math.sqrt(i);
        stop = System.currentTimeMillis();
        timeFor += stop-start;
        return stop-start;
    }

    // whileLoop
    private static long whileLoop() {
        double calc = 2.0;
        start = System.currentTimeMillis();
        int i=0;
        while(i<10000000) {
            calc = Math.sqrt(i);
            i++;
        }
        stop = System.currentTimeMillis();
        timeWhile += stop-start;
        return stop-start;
    }

    // doWhileLoop
    private static long doWhileLoop() {
        double calc =2.0;
        start = System.currentTimeMillis();
        int i=0;
        do {
             calc = Math.sqrt(i);
            i++;
        } while (i<10000000);
        stop = System.currentTimeMillis();
        timeDoWhile += stop-start;
        return stop-start;
    }

}
