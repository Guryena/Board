package Board.origin;

import java.text.SimpleDateFormat;

public class Date {
	Date nowDate = new Date();
	SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
	String strNowDate = date.format(nowDate);
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return strNowDate;
	}
	
	
	
}
