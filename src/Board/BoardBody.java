package Board;

public class BoardBody {
	protected String title;
	protected String body;
	protected String name;
	protected String date;

	public BoardBody(String title, String body, String name, String date) {

		this.title = title;
		this.body = body;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		String body = " 제목 : " + this.title + " 내용 : " + this.body + " 작성자  : " + name + " 작성일 : " + date;
		return body;
	}

}
