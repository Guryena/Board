package Board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PutBoardDown extends BoardHM implements ShowDate {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
	private String strNowDate;
	private String title;
	private String body;
	private String name;
	private Date date;
	
	public PutBoardDown(String title, String body, String name, Date date ) {
		number++;
		this.title = title;
		this.body = body;
		this.name = name;
		this.date = date;
		input();
		showDate();
	}

	private void input() {
		BoardBody boardbody = new BoardBody(title, body, name, showDate());
		map.put(number, boardbody);
	}

	@Override
	public String showDate() {
		strNowDate = dateFormat.format(date);
		return strNowDate;
	}

	@Override
	public String toString() {
		return "번호: " + super.number + " 제목: " + this.title + " 작성자: " +
				 this.name + "날짜: "+this.date;
	}
	
//	System.out.println("새 글이 정상적으로 등록되었습니다." + '\n');
}
