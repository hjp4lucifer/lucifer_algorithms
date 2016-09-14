package cn.lucifer.algorithm.count;

public class Rectangle {

	public int x1;
	public int x2;
	public int y1;
	public int y2;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x1, int x2, int y1, int y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public boolean checkIn(int x, int y) {
		if (x < x1 || x > x2 || y < y1 || y > y2) {
			return false;
		}
		return true;
	}
}
