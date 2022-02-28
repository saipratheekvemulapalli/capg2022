package Practice1;

public class Product {
	private long id;
	private String laptopname;
	private String size;
	private String color;
	private String model;
	private String weight;
	
	public Product() {
		
	}
	public Product(String laptopname, String size, String color, String model, String weight) {
		super();
		
		this.laptopname = laptopname;
		this.size = size;
		this.color = color;
		this.model = model;
		this.weight = weight;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLaptopname() {
		return laptopname;
	}
	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
}
