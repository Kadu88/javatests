package br.com.prova_OCP_808.programa;

public class BirdSeed {
	
private int numberBags;
boolean call;
public BirdSeed() {
	new BirdSeed(2);
call = false;
// LINE 2
}


public BirdSeed(int numberBags) {
this.numberBags = numberBags;
}
public static void main(String[] args) {
BirdSeed seed = new BirdSeed();
System.out.println(seed.numberBags);
} }