package week1.day1;

public class Assignment1 {

	public static void main(String[] args) {
		int i=-40;
		int j;
		if( i < 0) 
		{
			System.out.println ("The given number is Posiitve");
					}
		else if (i==0) {
	System.out.print("The given number is Zero");
		}
		else if (i<0) {
			System.out.println("The given number is Negaitve");
			j=1-(2*i);
			System.out.println("given number converted to postive: " + j);
		}
		else if (i<0 && i>0)
		{System.out.println("given number is a either positive or negaitve");
		}
	}
}
