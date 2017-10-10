
public class TestVertex {
	
	public static void main(String[] args) {
		
		Vertex v1 = new Vertex(2,3);
		Vertex v2 = v1.skalarMult(3.563454);
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(v1.length());
	}
}
