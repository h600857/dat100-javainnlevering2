package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String s = "[";
		int i = 0;
		
		for (int tall : tabell) {
			if (i > 0) {
				s += "," + tall;
			} else {
				s += tall;
				i ++;
			}
		}
		s += "]";
		return s;
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		/*
		for (int tall : tabell) {
			sum += tall;
		}
	
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		} */

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int t : tabell) {
			if (t == tall) {
				return true;
			}
		} return false;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				pos = i;
			}
		} return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];
				
		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length-i-1];
		} return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}
		} return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammensatt = new int[tabell1.length+tabell2.length];		
		int i = 0;
		
		while (i < sammensatt.length) {
			if (i < tabell1.length) {
				sammensatt[i] = tabell1[i];
			} else {
			sammensatt[i] = tabell2[i-tabell1.length];
			} i++;
		} return sammensatt;
	}
}
