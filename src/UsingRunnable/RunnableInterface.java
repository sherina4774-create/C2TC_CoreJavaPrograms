package UsingRunnable;


	class SharedResource {
	    int data;
	    boolean available = false;

	    synchronized void produce(int value) {
	        if (available) {
	            try {
	                wait(); // wait if data already produced
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	        data = value;
	        System.out.println("Produced: " + data);
	        available = true;
	        notify(); // notify consumer
	    }

	    synchronized void consume() {
	        if (!available) {
	            try {
	                wait(); // wait if data not produced
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	        System.out.println("Consumed: " + data);
	        available = false;
	        notify(); // notify producer
	    }
	}

	class Producer extends Thread {
	    SharedResource sr;

	    Producer(SharedResource sr) {
	        this.sr = sr;
	    }

	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            sr.produce(i);
	        }
	    }
	}

	class Consumer extends Thread {
	    SharedResource sr;

	    Consumer(SharedResource sr) {
	        this.sr = sr;
	    }

	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            sr.consume();
	        }
	    }
	}
	public class RunnableInterface {
	    public static void main(String[] args) {
	        SharedResource sr = new SharedResource();

	        Producer p = new Producer(sr);
	        Consumer c = new Consumer(sr);

	        p.start();
	        c.start();
	    }
	}




