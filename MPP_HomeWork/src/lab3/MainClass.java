package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int packageCount = 0;
		String output = "";
		Package pac; // = new Package();
		ArrayList<Package> pack = new ArrayList();

		System.out.println("Please Enter Number of Package: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		packageCount = Integer.parseInt(br.readLine());

		for (int i = 1; i <= packageCount; i++) {
			pac = new Package();
			pack.add(pac);
			output += pac.getRates()+"\n";
			// output+=pac.getMinimumRate();
		}
		System.out.println(output);
		/*
		 * for(Package p : pack) { p.getMinimumRate(); }
		 */

	}

}
