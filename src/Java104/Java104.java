package Java104;
import java.util.Scanner;
public class Java104 {
	public static void main(String[] args) {
		int r;
		double pi = 3.14;
		Scanner inp = new Scanner(System.in);
		System.out.println("dairenin yarıçapı:");
		r = inp.nextInt();
		double alan = pi*r*r;
		double cevre = 2*pi*r;
		System.out.println("daire alanı:"+alan);
		System.out.println("daire çevresi:"+cevre);	
	}

}
