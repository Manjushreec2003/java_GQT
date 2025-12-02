package in.datatypes;

public class MaxMinArray_07 {

	public static void main(String[] args) {
		int[] a = {5,1,9,3};
        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println(max+" "+min);
	}

}
