
public class mainMethod extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread(new thread1());
		Thread t2 = new Thread(new thread2());
		Thread t3 = new Thread(new thread3());
		Thread t4 = new Thread(new thread4());
		Thread t5 = new Thread(new thread5());

		t1.start();
		try {
			t1.join();
		} catch (Exception ex) {
		}

		t2.start();
		try {
			t2.join();
		} catch (Exception ex) {
		}

		t3.start();
		try {
			t3.join();
		} catch (Exception ex) {
		}

		t4.start();
		try {
			t4.join();
		} catch (Exception ex) {
		}

		t5.start();
		try {
			t5.join();
		} catch (Exception ex) {
		}
	}
}
