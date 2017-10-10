
public class TestVertex {
	
	public static void main(String[] args) {
		
		Vertex v1 = new Vertex(2,3);
		System.out.println(v1);
		
		Vertex v2 = v1.skalarMult(3.563454);
		System.out.println(v2);
		
		v1.addMod(v2);
		Vertex v3 = v1.add(v2);
		System.out.println(v1);
		System.out.println(v2.add(v1));
		
		
		
		System.out.println(v1.length());
	}
}
