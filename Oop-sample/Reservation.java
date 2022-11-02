package for_Git;

//4)  예약 ( 행위 )
//속성 : 시간, 인원, 예약자, 연락처 ,  상태 (예약중, 예약취소)
//행동 : 예약하기, 예약변경, 취소, 조회

public class Reservation {
	private int time;
	private int pernum;
	private String resername;
	private String phonenum;
	private boolean status;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPernum() {
		return pernum;
	}
	public void setPernum(int pernum) {
		this.pernum = pernum;
	}
	public String getResername() {
		return resername;
	}
	public void setResername(String resername) {
		this.resername = resername;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
