
public class ComputerParts implements Comparable<ComputerParts> {

	private String partName;
	private String brand;
	private String type;
	private double price;
	private int quant;
	public ComputerParts(String pn, String b, String t, double p, int q) {
		this.partName = pn;
		this.brand = b;
		this.type = t;
		this.price = p;
		this.quant = q;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
        public void settype(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public boolean Eequals(ComputerParts obj) {
		if (obj instanceof ComputerParts) {
			return (obj.partName.equalsIgnoreCase(partName));
		}
		else
			return false;
	}
        public int compareTo(ComputerParts Cp){
		return (this.partName.compareToIgnoreCase(Cp.partName));	
	}
	public String toString() {
		return this.partName + "\t " + this.brand + "\t " + this.type + "\t$ " + this.price + "\t " + this.quant;
	}
}	
