package 서버프로그램구현_정희승.DTO;

public class User {
	
	private int num;
	private String id;
	private String pw;
	private String name;
	private String email;
	
	public User() {}
	public User(int num, String id, String pw, String name, String email) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
