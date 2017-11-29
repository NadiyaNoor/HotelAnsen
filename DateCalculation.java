package ANSEN;
import java.util.Date;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class DateCalculation {
	public static void main(String[] args){
		
	}
	
	public static float date(String checkIN, String checkOUT){
		SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
		float daysBetween=0;
		try {
			Date dateBefore = myFormat.parse(checkIN);
			Date dateAfter = myFormat.parse(checkOUT);
			long difference = dateAfter.getTime() - dateBefore.getTime();
			daysBetween = (difference / (1000*60*60*24));
			/* You can also convert the milliseconds to days using this method
			 * float daysBetween = 
			 *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
			 */
			System.out.println("Number of Days between dates: "+daysBetween);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return daysBetween;
	}
	
}