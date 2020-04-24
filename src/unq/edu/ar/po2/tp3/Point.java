package unq.edu.ar.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x2, int y2) {
		this.x = x2;
		this.y = y2;
		
	}
	
	public int getX() {
		return x;
		
	}
	public int getY() {
		return y;
		
	}
	public void moverPuntoA(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Point sumaPuntoA(Point punto) {
	    int x = this.x + punto.x;
		int y = this.y + punto.y;
		return new Point(x,y);
		
	}
}
