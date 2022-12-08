package com.hp;

public interface FlipcartCompany {

	abstract void Product();

	abstract void orderonline();

	abstract void delivery();

}

class PeterEngland implements FlipcartCompany {

	public void Product() {
		System.out.println("Shirt");
		System.out.println("Jeans");
		System.out.println("Jacket");

	}

	public void orderonline() {
		System.out.println("Recieve by Flipcart");
		System.out.println(" Issue the Order by PeterEngland ");
		System.out.println("Thank you For Shopping us");

	}

	public void delivery() {
		System.out.println("Handover the Product by Peter Engaland");

	}

}

class Adidas implements FlipcartCompany {

	public void Product() {
		System.out.println("Track Pnats");
		System.out.println("Shoes");
		System.out.println("T-Shirt");

	}

	public void orderonline() {
		System.out.println("Recieve by Flipcart");
		System.out.println(" Issue the Order by adidas");
		System.out.println("Thank you For Shopping us");

	}

	public void delivery() {
		System.out.println("Handover the Product by Adidas");

	}

}

class Flipcartapp {

	FlipcartCompany SelectBrand(char ch) 
	{
		if (ch == 'A') 
		{
			return new PeterEngland();
		} 
		else
		{
			return new Adidas();
		}

	}
}

