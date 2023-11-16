package Lab2;

public class Billing {
	
	/**
	 * This method expects to check the location of the call.
	 * @param location:character value for location where the call is done.
	 * @pre location is either 'd', 'e' or 'o' that stands for Domestic, Europe and Other respectively.
	 * @return This method returns a boolean value for the validity of location. 
	 **/
	
	public static boolean isValidLocation(char location) throws Exception {
		
		boolean checkValidity = false;
		
		if(location =='d' || location =='D') {
			checkValidity = true;
		}
		else if(location =='e' || location =='E') {
			checkValidity = true;
		}
		else if(location =='o' || location =='O') {
			checkValidity = true;
		}
		else {
			throw new Exception("Invalid character");
		}
		
		return checkValidity;
	}
	
	/**
	 * This method expects to check the validity of Duration.
	 * @param duration: double value for duration of long distance calling.
	 * @pre 1 <= duration <= 60 minutes
	 * @return This method returns a boolean value for the validity of duration.
	 **/
	
	public static boolean isValidDuration(int time) throws Exception{
		boolean checkValidity = false;
		
		if(time >= 1 && time <= 60) {
			checkValidity = true;
		}
		else {
			throw new Exception("Invalid Integer");
		}
		
		return checkValidity;
	}
	
	/**
	 * This method expects to return the total bill for long distance calling.
	 * @param duration: double value for duration of long distance calling.
	 * @param location:character value for location where the call is done.
	 * @pre 1 <= duration <= 60 minutes
	 * @pre location is either 'd', 'e' or 'o' that stands for Domestic, Europe and Other respectively.
	 * @return This method returns to total bill for long distance calling. 
	 **/
	
	public static double bill(double duration, char location) throws Exception {
		double totalBill = 0;
		
		if(isValidLocation(location)) {
			
			int convertedDuration = (int) Math.ceil(duration);
			if(isValidDuration(convertedDuration)) {
				
				if(location =='d' || location =='D') {
					if(convertedDuration <= 20) {
						totalBill = 0.05 * convertedDuration;
					}
					else {
						totalBill = (20 * 0.05) + 0.1 * (convertedDuration-20);
					}
				}
				else if(location =='e' || location =='E') {
					if(convertedDuration <= 20) {
						totalBill = 0.1 * convertedDuration;
					}
					else {
						totalBill = (20 * 0.1) + 0.5 * (convertedDuration - 20);
					}
				}
				else if(location =='o' || location =='O') {
					if(convertedDuration <= 20) {
						totalBill = 0.5 * convertedDuration;
					}
					else {
						totalBill = (20 * 0.5) + 1.0 * (convertedDuration- 20);
					}
				}
			}
		}
		
		return totalBill;
	}	
}
