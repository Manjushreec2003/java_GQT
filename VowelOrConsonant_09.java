package in.operators;
import java.util.*;
public class VowelOrConsonant_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char c = Character.toLowerCase(ch);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') System.out.println("Vowel");
        else System.out.println("Consonant");
        sc.close();
	}

}
