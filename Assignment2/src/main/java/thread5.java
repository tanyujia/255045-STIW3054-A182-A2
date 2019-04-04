
public class thread5 extends readPDF implements Runnable {

	public thread5(String[] l) {
		line = l;
	}

	public thread5() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		super.run();
		for (String l : line) {
			if ((l.indexOf("STIW3054")) != -1) {
				System.out.println("\nThread-5 Display the information of STIW3054 (Bil, Code, Course, date and time).");
				System.out.println("= " + l + "=");
			}
		}
	}
}
