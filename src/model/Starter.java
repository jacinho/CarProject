package model;

public class Starter {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.setBrand("bmw");
		bmw.setVelocity(297);

		System.out.println(bmw.getBrand() + "" + bmw.getVelocity());

	}


}
