public class MyThreadClass {

    int counter = 0;


    public synchronized void printOdd() {

        while (counter < 10) {



            counter++;
            System.out.println(counter +"Thread is " +Thread.currentThread().getName());

            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        /*while (counter < 10) {

            // If count is even then print
            while (counter % 2 == 0) {

                // Exception handle
                try {
                    wait();
                }
                catch (
                        InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Print the number
            System.out.print(counter + " ");

            // Increment counter
            counter++;

            // Notify to second thread
            notify();
        }*/

    }

    public synchronized void printEven() {
        while (counter < 10){
            counter++;

            System.out.println(counter);
        }

       /* while (counter < 10) {

            // If count is odd then print
            while (counter % 2 == 1) {

                // Exception handle
                try {
                    wait();
                } catch (
                        InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Print the number
            System.out.print(
                    counter + " ");

            // Increment counter
            counter++;

            // Notify to 2nd thread
            notify();
        }*/

}

    public static void main(String[] args){
        MyThreadClass myThreadClass = new MyThreadClass();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                myThreadClass.printOdd();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myThreadClass.printOdd();
            }
        });

        thread.setName("odd");
        thread2.setName("even");
        thread.start();
        thread2.start();
    }
}
