package no.hvl.dat100.lab5.tabeller;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tabeller {

	private static boolean a;
	private static int[] arr2s;
	private static int[] arr1s;

	// a)
	public static void skrivUt(int[] tabell) {
System.out.println(tabell);
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		  String strArray[] = new String[tabell.length];

	        for(int i = 0; i < tabell.length; i++) {
	        strArray[i] = String.valueOf(tabell[i]);
	        }
	        return Arrays.toString(strArray);
	}

	// c)
	public static int summer(int[] tabell) {
		   int sum = 0;
	        for(int i =0; i < tabell.length; i++) {
	            sum = sum + tabell[i];
	        }
	        return sum;
	 
	    

		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int i = 0; i< tabell.length; i++){
	        if(tabell[i] == tall){
	          return true;
	    }
	   }
		return false;
	   
	  

		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for(int i=0; i<tabell.length; i++) 
	         if(tabell[i] == tall)
	             return i;
		return -1;

	

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] e = tabell;      
	    int[] nytabell = e.clone();
		 for(int i=0; i<nytabell.length/2; i++){
	            int b = nytabell[i];
	            nytabell[i] = nytabell[nytabell.length -i -1];
	            nytabell[nytabell.length -i -1] = b;
	        }
			return nytabell;

		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}

		return true;

		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int length = tabell1.length + tabell2.length;
        int tabell3[] = new int[length];
        int pos = 0;
        for (int element : tabell1) {
            tabell3[pos] = element;
            pos++;
            }
        for (int element : tabell2) {
            tabell3[pos] = element;
            pos++;
            }
        return tabell3;



	}

	
	}

