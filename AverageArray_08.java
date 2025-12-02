package in.datatypes;

public class AverageArray_08 {

	public static void main(String[] args) {
		int[] a = {2,4,6,8};
        int sum=0;
        for(int x:a) sum+=x;
        System.out.println(sum/(double)a.length);

	}

}
