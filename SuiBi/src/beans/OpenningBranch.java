package beans;

import java.util.Date;

public class OpenningBranch {
	
	private String owner;
	private String bookname;
	private int chapter;
	private String fangshi;
	private Date insert_date;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getChapter() {
		return chapter;
	}
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
	public String getFangshi() {
		return fangshi;
	}
	public void setFangshi(String fangshi) {
		this.fangshi = fangshi;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
	
}
