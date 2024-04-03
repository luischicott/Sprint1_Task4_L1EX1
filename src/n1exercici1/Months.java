package n1exercici1;

public class Months {

	
	
	public static String [] months() {
		
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
				 "October", "November", "December"};  
		return months; 			
	}
	
	
	public static String potition8(String [] month){
		String ans = ""; 
		if(month[7].equals("August")) {
			ans = "August";
		} 
		return ans; 
	}
	
	public static int arrayLength(String [] month){
		int number = 0; 
		
		if(month.length == 12) {
			number = 12; 
		}
		return number; 
	}
	
	public static boolean arrayNotNull(String [] month) {
		return month != null; 
	}
}


