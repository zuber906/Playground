import java.util.Scanner;
class Main {
  
  private static Scanner sc;
	public static void main (String[] args){
	 int number, i;
		sc = new Scanner(System.in);
		
	
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i +"\n"); 
			}
		}	
}
}