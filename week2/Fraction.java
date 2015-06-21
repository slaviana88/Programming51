package com.hackbulgaria.programming51.week2;


public class Fraction {
	public int numerator =0;
	public int denominator =1;
	


	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	private int gcd(int x, int y) {	
	int z;
	z = x % y;
	if (z == 0) return y;
	else return gcd(y,z);
	}
	
	public String toString(){
		return numerator+"/"+denominator;
	}
	
	public double getReal(){
		return (double)numerator/denominator;
	}
	
	public void sum(Fraction F){
		this.numerator= this.numerator * F.denominator + F.numerator* this.denominator;
		this.denominator = this.denominator * F.denominator;
		simplify();
	}
	
	public void simplify(){
		int temp=gcd(this.numerator,this.denominator);
		this.numerator=numerator/temp;
		this.denominator=denominator/temp;
	}
}
