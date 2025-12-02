package in.datatypes;

public class SortArray_21 {

	public static void main(String[] args) {
		 int[] a = {5,1,4};
	        for(int i=0;i<a.length;i++)
	            for(int j=i+1;j<a.length;j++)
	                if(a[i]>a[j]){
	                    int t=a[i]; a[i]=a[j]; a[j]=t;
	                }

	        System.out.println("Asc:");
	        for(int x:a) System.out.print(x+" ");

	        System.out.println("\nDesc:");
	        for(int i=a.length-1;i>=0;i--)
	            System.out.print(a[i]+" ");
	}

}
