
public class Primetest {
	
	
	public static void main (String[] args) {
		
		
		
		for(int n=2; n<1000; n++){
			
			if(isPrime(n)){
		}
		
		System.out.println(n);
		}		

		System.out.println(n+": "+isPrime(n));
		
	}
	

	private static boolean isPrime(int z ){
	
				
	boolean prim = true;
	
	int i = 2;
	
		if (z==1) {
			prim = false;
	
		}
		else{
			while (i <=z-1 && prim == true) {
				if (z% i==0)
					prim = false;
			
			else{
				prim = true;
			}
			
			i = i+1;
			
			}
		}

		return prim;
}
}
