package cn.sz.xhq.basics;


public class Monster extends Biology {

	private int price;//价值 经验值
	
	public Monster(){
		
	}
	public Monster(String name,int grade,int atk,int defen,int speed,String camp,int blood,int price){
		super(name,grade,atk,defen,speed,camp,blood);
		this.price = price;
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	
	
}
