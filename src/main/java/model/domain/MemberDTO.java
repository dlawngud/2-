package model.domain;

public class MemberDTO {
	private int mno;
	private String name;
	private String id;
	private String pw;
	private int point;
	private String addr;
	private String phone;
	private String auth;
	
	public MemberDTO() {}
	public MemberDTO(String name, String id, String pw, String addr, String phone){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.addr = addr;
		this.phone = phone;
	}
	public MemberDTO(String id, String pw, String addr, String phone){
		this.id = id;
		this.pw = pw;
		this.addr = addr;
		this.phone = phone;
	}
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberDTO [mno=");
		builder.append(mno);
		builder.append(", name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", pw=");
		builder.append(pw);
		builder.append(", point=");
		builder.append(point);
		builder.append(", addr=");
		builder.append(addr);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", auth=");
		builder.append(auth);
		builder.append("]\n");
		return builder.toString();
	}
}
