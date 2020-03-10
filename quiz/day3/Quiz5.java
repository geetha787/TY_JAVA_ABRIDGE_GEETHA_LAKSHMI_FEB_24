package com.capgemini.quiz.day3;
class Product{
	double price;
}
public class Quiz5 {
public void updateprice(Product product,double price) {
	price=price*2;
	product.price=product.price+price;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prt=new Product();
		prt.price=200;
		double newPrice=100;
		Quiz5 q1=new Quiz5();
		q1.updateprice(prt, newPrice);
		System.out.println(prt.price+":"+newPrice);
		

	}

}
