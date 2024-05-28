package Day0528.dto;

public class GoodsInfo {
	public String code, name, maker;
	public int cost, discount;
	
	public GoodsInfo(String code, String name, String maker, int cost) {
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.cost = cost;
	}
	
	public void changeDiscount(int discount) {
		this.discount = discount;
	}
	
	public int saleCost() {
		// 70000 0% : 70000
		// 70000 30% : 49000
		return cost * (100-discount) / 100 ;
	}

}
