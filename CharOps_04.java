package in.datatypes;
import java.util.Scanner;
public class CharOps_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) System.out.println(Character.toUpperCase(ch));
        else System.out.println(Character.toLowerCase(ch));

        sc.close();
	}

}
