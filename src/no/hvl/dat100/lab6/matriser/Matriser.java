package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int x[] : matrise) {
			for (int y : x) {
				System.out.print(y);
			} System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String utskrift = "";
		for (int x[] : matrise) {
			for (int y : x) {
				utskrift += Integer.toString(y) + " ";
			} utskrift += "\n";
		} return utskrift;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] multiplisert = new int[matrise.length][];
		for (int x = 0; x < matrise.length; x++) {
			multiplisert[x] = new int[matrise[x].length];
			for (int y = 0; y < matrise[x].length; y++) {
				multiplisert[x][y] = (matrise[x][y]*tall);
			}
		} return multiplisert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		String tekstA = tilStreng(a);
		String tekstB = tilStreng(b);
		return tekstA.equals(tekstB);
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		for (int x = 0; x < matrise.length; x++) {
			for (int y = 0; y < x; y++) {
				int holder = matrise[x][y];
			    matrise[x][y] = matrise[y][x];
			    matrise[y][x] = holder;
			}  		
		} return matrise;
	}	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
	}
}
