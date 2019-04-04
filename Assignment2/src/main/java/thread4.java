
public class thread4 extends readPDF implements Runnable {

	private String codeSOC[] = { "STIA", "STID", "STIJ", "STIK", "STIN", "STIW", "STQM", "STQS" };
	private String[] soc = new String[1000];

	public thread4() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		super.run();
		int i = 0;
		int count = 0;
		for (String l : line) {
			for (String search : codeSOC) {
				try {
					if ((l.contains(search)) && (l.charAt(6) == 'S') && (l.charAt(7) == 'T')) {
						soc[i] = l;
						i++;
					}
				} catch (Exception ex) {

				}
			}
		}

		for (String s : soc) {
			if (s != null) {
				count++;
			}
		}
		System.out.println("\nThread-4 Calculate the number of courses from SOC");
		System.out.println("= " + count + " courses =");
	}
}
