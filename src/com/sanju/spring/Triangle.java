package com.sanju.spring;

public class Triangle implements Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void area() {
		int l = pointB.getX() - pointA.getX();
		int w = pointC.getY() - pointA.getY();
		System.out.println("Area of triangle is " + (0.5 * l * w));
	}
	
	public void draw() {
		System.out.println("(" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("(" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("(" + pointC.getX() + ", " + pointC.getY() + ")");
	}
}
