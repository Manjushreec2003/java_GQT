package in.datatypes;

public class CharCount_14 {

	public static void main(String[] args) {
		String s = "banana";
        char c = 'a';
        int count = 0;
        for(char ch : s.toCharArray())
           if(ch==c) count++;
        System.out.println(count);
	}

}
