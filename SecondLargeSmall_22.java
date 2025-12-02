package in.datatypes;

public class SecondLargeSmall_22 {

	public static void main(String[] args) {
		int[] a={5,1,4,3};
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]>a[j]){
                    int t=a[i]; a[i]=a[j]; a[j]=t;
                }
        System.out.println(a[1]);
        System.out.println(a[a.length-2]);
	}

}
