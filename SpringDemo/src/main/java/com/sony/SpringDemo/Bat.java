package com.sony.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bat {
	@Value("Kokabura")
	private String brand;
	@Value("1100")
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bat [brand=" + brand + ", price=" + price + "]";
	}
		
}
