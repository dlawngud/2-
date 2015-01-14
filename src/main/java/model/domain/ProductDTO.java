package model.domain;

public class ProductDTO {
	private int  pno;
	private String pname;
	private int price;
	private int quantity;
	private int cno;
	String releaseDate;
	private CategoryDTO c;
	
	public ProductDTO() {
	}
	public ProductDTO(int pno) {
		this.pno =pno;
	}
	public ProductDTO(int pno, String pname, int price, int quantity, int cno, String releaseDate, CategoryDTO c) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.cno = cno;
		this.releaseDate =releaseDate;
		this.c = c;
	}
	public ProductDTO(int pno, String pname, int price, int quantity, int cno) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.cno = cno;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getType() {
		return cno;
	}
	public void setType(CategoryDTO c) {
		this.c = c;
	}
	public String getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate){
		this.releaseDate =releaseDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductDTO [pno=");
		builder.append(pno);
		builder.append(", pname=");
		builder.append(pname);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", cno=");
		builder.append(cno);
		builder.append(", releaseDate=");
		builder.append(releaseDate);
		builder.append(", c=");
		builder.append(c);
		builder.append("]");
		return builder.toString();
	}
}
