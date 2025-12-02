package in.datatypes;

public class PalindromeString_15 {

	public static void main(String[] args) {
		String s = "madam";
        int i=0, j=s.length()-1;
        boolean ok=true;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) ok=false;
            i++; j--;
        }
        System.out.println(ok ? "Palindrome" : "Not Palindrome");
	}

}
