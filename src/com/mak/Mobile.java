package com.mak;

public class Mobile {

	
		String brand, color;
		double price;
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	
		public double getDiscount()
		{
			if(getBrand().compareToIgnoreCase("Samsung")==0)
				return getPrice()*0.1;
			if(getBrand().compareToIgnoreCase("MotoG")==0)
				return getPrice()*0.15;
			return 0.0;
		}
}
