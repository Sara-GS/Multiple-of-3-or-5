public class Multiple3or5{
	public static void main (String[] args) {
		int sum_3 = 0,
			sum_5 = 0;

		for (int x =1; x<=1000; x++) {
			if ( (x*3) < 1000) {
				sum_3 += (x*3);
			}
			if ( (x*5) < 1000 ) {
				sum_5 += (x*5);
			}
			System.out.println((x*3) + " " + (x*5) + " " + sum_3 + " " + sum_5);
		}
		System.out.println(sum_3);
		System.out.println(sum_5);
		System.out.println(sum_3+sum_5);


	}
}
@Sara-GS
 