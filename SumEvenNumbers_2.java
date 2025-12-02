package in.introduction;

public class SumEvenNumbers_2 {

	public static void main(String[] args) {
	    int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {    // checks even number
                sum = sum + i;
            }
        }

        System.out.println("Sum of even numbers = " + sum);
	}

}
