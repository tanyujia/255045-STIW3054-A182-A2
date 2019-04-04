import java.util.Arrays;
import java.util.LinkedHashSet;

public class thread2 extends readPDF implements Runnable {

	public thread2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		super.run();
		String ignore1 = "SESI 2018/2019 (A182) ";
		String ignore2 = "EXAMINATION SESSION 2018/2019 (A182) ";
		String ignore3 = "BIL. CODE COURSE DATE/TIME ";
		String tempDate[] = new String[line.length];
		int count = 0;
		int i = 0;

		for (String l : line) {
			if ((!l.equals(ignore1)) && (!l.equals(ignore2)) && (!l.equals(ignore3)) && (l.contains("/"))) {
				try {
					int index = l.indexOf("/");
					String date = l.substring(index - 2, index + 7);
					tempDate[i] = date;
					i++;
				} catch (Exception ex) {

				}
			}
		}

		LinkedHashSet<String> lhSetColors = new LinkedHashSet<String>(Arrays.asList(tempDate));
		String[] newArray = lhSetColors.toArray(new String[lhSetColors.size()]);

		for (String print : newArray) {
			if (print != null) {
				count++;
			}
		}
		System.out.println("\nThread-2 Calculate the total number of days");
		System.out.println("= " + count + " days =");

	}

}
