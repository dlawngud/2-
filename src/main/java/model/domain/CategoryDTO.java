package model.domain;

public class CategoryDTO {
	private int cno;
	private String category;
	
	public CategoryDTO() {
	}
	public CategoryDTO(int cno, String category) {
		super();
		this.cno = cno;
		this.category = category;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("typeDTO [cno=");
		builder.append(cno);
		builder.append(", category=");
		builder.append(category);
		builder.append("]");
		return builder.toString();
	}
}
