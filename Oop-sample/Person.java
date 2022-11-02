package for_Git;

//5)  »ç¶÷
//¼Ó¼º :  ³ªÀÌ, ¸ö¹«°Ô, Ç÷¾Ð, Ã¼¿Â, Ç÷´ç, ¸Æ¹Ú
//Çàµ¿ :  »ýÀÏ, ¿îµ¿, ¹ä¸Ô±â

public class Person {
	private boolean gender;
	private int age;
	private double weight;
	private double height;
	private int blood_pres;
	private double body_temp;
	private int blood_sugar;
	private int pulse;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getBlood_pres() {
		return blood_pres;
	}
	public void setBlood_pres(int blood_pres) {
		this.blood_pres = blood_pres;
	}
	public double getBody_temp() {
		return body_temp;
	}
	public void setBody_temp(double body_temp) {
		this.body_temp = body_temp;
	}
	public int getBlood_sugar() {
		return blood_sugar;
	}
	public void setBlood_sugar(int blood_sugar) {
		this.blood_sugar = blood_sugar;
	}
	public int getPulse() {
		return pulse;
	}
	public void setPulse(int pulse) {
		this.pulse = pulse;
	}
	
	void birth(){
		this.age++;
		if(this.gender == false && this.age <=15) {
			this.height++;
		}
		else if(this.gender == true && this.age<=17) {
			this.height++;
		}
	}
	void exercise(double momentum) {
		this.weight--;
		this.blood_pres++;
		this.blood_sugar--;
		this.body_temp++;
		this.pulse++;
	}
	void eating(double calories) {
		this.weight++;
		this.blood_pres++;
		this.blood_sugar++;
		this.body_temp++;
		this.pulse++;
	}
	
}
