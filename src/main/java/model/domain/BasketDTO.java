package model.domain;

public class BasketDTO {
	private int memberNo;
	private int productNo;
	private int quantity;
	
	public BasketDTO(){
		
	}
	
	public BasketDTO(int memberNo, int productNo, int quantity) {
		
		this.memberNo = memberNo;
		this.productNo = productNo;
		this.quantity = quantity;
	}

	public BasketDTO(int mno, int pno) {
		this.memberNo = mno;
		this.productNo = pno;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasketDTO [memberNo=");
		builder.append(memberNo);
		builder.append(", productNo=");
		builder.append(productNo);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}
	
}
