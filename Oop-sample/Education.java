package for_Git;

//3)  강의 ( 상황 )
//속성 : 강좌제목,  강사, 수강생
//행동 : 시작, 종료, 평가

public class Education {
	private String name;
	private String teacher;
	private int studnum;
	private int time;
	private int degree;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getStudnum() {
		return studnum;
	}
	public void setStudnum(int studnum) {
		this.studnum = studnum;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	void educa_Go(int stunum) {
		
	}
}
