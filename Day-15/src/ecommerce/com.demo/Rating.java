package Practice1;

public class Rating {
	private long id;
	private String noofstars;
	private String review;
	
	Rating(){
		
	}
	
	public Rating(String noofstars, String review) {
		super();
		this.noofstars = noofstars;
		this.review = review;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getNoofstars() {
		return noofstars;
	}
	public void setNoofstars(String noofstars) {
		this.noofstars = noofstars;
	}
}
