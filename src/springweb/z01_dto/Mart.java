package springweb.z01_dto;

import java.util.ArrayList;

public class Mart {
	private String martName;
	private Product product;
	private ArrayList<Product> prodList;
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setMartName(String martName) {
		this.martName = martName;
	}
	public void setProdList(ArrayList<Product> prodList) {
		this.prodList = prodList;
	}
	public Product getProduct() {
		return product;
	}
	public String getMartName() {
		return martName;
	}
	public void selling(){
	System.out.println("�������. "+martName+" �Դϴ�.");	
	System.out.println("���� ��õ ����..");
	System.out.println(product.getName()+", "+product.getPrice()+"������ ��ʴϴ�!!");
	System.out.println("���� ����!");
	for(Product prod:prodList){
		System.out.println(prod.getName()+"\t");
		System.out.println(prod.getPrice()+"\t");
	}
	}
}
