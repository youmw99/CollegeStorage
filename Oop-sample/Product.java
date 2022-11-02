package for_Git;

import javax.swing.plaf.synth.SynthSeparatorUI;

//1)  상품
//속성 :  상품명, 가격, 수량
//행동 :  판매(수량 감소) ,  입고(수량증가),  예약....

public class Product {
	private final String name;
	private int price;
	private int order;
	
	Product(String name){
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	void decre_order(int order) {
		this.order -= order;
	}
	void intcre_order(int order) {
		this.order += order;
	}
	void reservation(String name) {
		System.out.println(name + "을 예약합니다.");
		if(this.name ==name) {
			System.out.println("예약완료");
		}
		else {
			System.out.println("그 상품은 예약하실 수 없습니다.");
		}
	}
	
}
