import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int num, count, total = 0;

        
        
        //Scanner is used for reading user input
        Scanner scan = new Scanner(System.in);
        //nextInt() method reads integer entered by user
        num = scan.nextInt();
        //closing scanner after use
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println(+total);
	}
}