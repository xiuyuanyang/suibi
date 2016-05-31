package beans;

public class BranchVotingPool {	
	private String bvpid;
	private String owner;
	private String zuozhe;
	private String bookname;
	private int chapter;
	private String chaptername;
	private String content;
	private int voted_number;
	
	public String getBvpid() {
		return bvpid;
	}
	public void setBvpid(String bvpid) {
		this.bvpid = bvpid;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
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
	public String getChaptername() {
		return chaptername;
	}
	public void setChaptername(String chaptername) {
		this.chaptername = chaptername;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getVoted_number() {
		return voted_number;
	}
	public void setVoted_number(int voted_number) {
		this.voted_number = voted_number;
	}

}
