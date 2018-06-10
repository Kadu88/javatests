package br.com.prova_OCP_808.programa;

public class Bunny {
	private String color;
	private final int height;
	private final int length;

	public Bunny(int length, int height) {
		this.length = length; // backwards – no good!
		this.height = height; // fine because a different name
		this.color = "white"; // fine, but redundant
	}
	
	public Bunny() {
		this.length = 9;
		this.height = 12;
	}

	public static void main(String[] args) {
		Bunny b = new Bunny(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}
}