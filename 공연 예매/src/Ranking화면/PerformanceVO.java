package Ranking화면;

public class PerformanceVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌
	private String id;
	private String title;
	private String location;
	private String releasedate;
	private String finaldate;

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getFinaldate() {
		return finaldate;
	}
	public void setFinaldate(String finaldate) {
		this.finaldate = finaldate;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PerformanceVO [id=" + id + ", title=" + title + ", location=" + location + ", releasedate="
				+ releasedate + ", finaldate=" + finaldate + "]";
	}
	
	
}
