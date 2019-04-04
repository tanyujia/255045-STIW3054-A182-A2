
public class thread1 extends readPDF implements Runnable {

	public thread1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		super.run();
		int total = 0;
		String ignore = "BIL. CODE COURSE DATE/TIME ";

		for (String l : line) {
			try {
				if ((!l.equals(ignore)) && (l.contains("."))) {
					total++;

				}

			} catch (Exception ex) {

			}
		}
		System.out.println("Thread-1 Calculate the total number of courses");
		System.out.println("= " + total + " courses =");
	}
}
