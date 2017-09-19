public class HelloWorld {

	public static void main(String[] args) {
		
	for(int i = 1; i<= 100; i++ )
		/*In dieser for Schleife wird festgelegt für welchen Zahlenbereichdie Collazvermutung durchgeführt wird **/
	{
		int n = i;
		System.out.print(n +": ");
		
	do{
		if(n%2==0)
		{n=n/2;}
		else 
		{n=3*n+1;}
		
		System.out.print(n +" ");}
		while(n>1);
		System.out.println();
			}
		}
	}


