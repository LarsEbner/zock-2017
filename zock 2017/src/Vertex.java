public class Vertex {

	public double x;
	public double y;
	
	public Vertex(double x, double y){
	
		this.x = x;
		this.y = y;
		
	}
	
		public String toString(){
			return "("+x+","+y+")";
		}
		
		public double length(){
			
			return Math.sqrt(x*x+y*y);
			
		}
		
		public Vertex skalarMult(double s){
			return new Vertex(x*s,y*s);
		}
		
		public void skalarMultMod(double s){
			x=x*s;
			y=y*s;
		}
		
		public Vertex add(Vertex v){
			return new Vertex(v.x+x, v.y+y);
		}
}	