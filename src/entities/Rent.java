package entities;

public class Rent {
	
	private String name;
	private String email;
	private Integer daily;
	
	public Rent(String name, String email, Integer daily) {
		this.name = name;
		this.email = email;
		this.daily = daily;
	}
	public Integer getDaily() {
		return daily;
	}
	public void setDaily(Integer daily) {
		this.daily = daily;
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
	public Integer price(Integer price) {
		return daily * 40;
	}
	public String toString() {
		return "Name: " + name + ", " + "E-mail: " + email + ", " + "Daily: " + daily +", " + String.format("Price U$%.2f", price(0));
	}
}