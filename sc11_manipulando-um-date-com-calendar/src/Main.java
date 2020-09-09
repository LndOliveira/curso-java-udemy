import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Date date = Date.from(Instant.parse("2020-09-07T11:50:23Z"));
		
		System.out.println(sdf.format(date));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		/*
		cal.add(Calendar.HOUR_OF_DAY, 4);
		date = cal.getTime();
		*/
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("MINUTES: " + minutes);
		System.out.println("MONTH: " + month);

	}

}
