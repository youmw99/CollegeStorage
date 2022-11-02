package for_Git;

//2)  태풍 ( 자연현상 )
//속성 : 태풍이름 , 번호 , 현재 위치(위도,경도) , 이동속도, 등등...
//행동 : 이동(위도,경도 변경)

public class Hurricane {
	private final String name;
	private final int num;//태풍번호는 수정할 일이 없다고 생각하였기 때문에 String으로 지정
	private int latitude;
	private int longitude;
	private int speed;
	
	Hurricane(String name, int num){
		this.name=name;
		this.num = num;
	}
	Hurricane(int num, String name){
		this.name=name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void change_la_n_long(int latitude, int longitude) {
		System.out.println("위도와 경도를 "+latitude+"도, "+longitude+"도로 변경합니다.");
		this.latitude=latitude;
		this.longitude=longitude;
	}
}
