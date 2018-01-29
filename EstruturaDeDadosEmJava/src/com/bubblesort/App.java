package com.bubblesort;
public class App {
	public static void main(String a[]) {
	   int[] array = {10,8,6,4,2,9,7,5,3,1};
	      
	   System.out.print("Antes de ser ordenado: " );     
	   for(int x = 0; x < array.length; x++) {
         System.out.print( " " + array[x]);     
	   }
	   System.out.println(" ");     
	   int remaining = array.length - 1;
	   for(int x = 0; x < (array.length-1); x++) {
		   for(int y = 0; y < (remaining); y++) {
			   int tmp;
			   if ( array[y] > array[y+1] ) {
				   tmp =  array[y+1]; 
				   array[y+1] = array[y];
				   array[y] = tmp;
			   }
		   }
		   remaining--;
	   }
	   System.out.print("Depois de ser ordenado: " );     
	   for(int x = 0; x < array.length; x++) {
		   System.out.print( " " + array[x]);     
	   }
	   System.out.println(" ");     
	}
}
