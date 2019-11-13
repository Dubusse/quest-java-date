import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date current = new Date();
		
		
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
    	Calendar c = new GregorianCalendar(year, month-1, day);
    	Date d = c.getTime();
        System.out.println (" the Date is : " + sdf.format(d));
        System.out.println (" the Day of week is : " + c.get(Calendar.DAY_OF_WEEK));
     
        sc.close();

        
    }
}