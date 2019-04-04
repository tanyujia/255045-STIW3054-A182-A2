
public class thread3 extends readPDF implements Runnable {

	private String codeSOC[] = { "STIA", "STID", "STIJ", "STIK", "STIN", "STIW", "STQM", "STQS" };
	private String[] soc = new String[1000];

	public thread3() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		super.run();
		int i = 0;
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
		System.out.println("\nThread-3 List of courses from SOC");
		for (String print : soc) {
			if (print != null) {
				System.out.println("= " + print.substring(6));
			}
		}
	}
}