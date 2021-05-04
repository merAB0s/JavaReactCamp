package Entities;

public class Campaign {
	
	int id;
	String name;
	int discountRate;
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id,String name,int discountRate) {
		
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
