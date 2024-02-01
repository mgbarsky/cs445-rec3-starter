package rec3;

public class Product{
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public boolean equals(Object o) {
		Product p = (Product) o;
		return (this.name.equals(p.name) && this.price == p.price);
	}
	
	public boolean equals(Product p) {
		return (this.name.equals(p.name) && this.price == p.price);
	}
	
	@Override
	public String toString() {
		return this.name +": " + this.price;
	}
}
