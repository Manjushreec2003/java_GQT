package in.datatypes;


class Student {
    String name;
    Student(String name){ this.name = name; }
}
public class ArrayObjects_20 {

	public static void main(String[] args) {
		Student[] s = { new Student("A"), new Student("B") };
        for(Student st : s) System.out.println(st.name);
	}

}
