
public class Compare {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		if (str1 == str2)
			System.out.println("str1 equals to str2");
		if (str2 == str3)
			System.out.println("str2 equals to str3");
		if (str1 == str3)
			System.out.println("str1 equals to str3");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));

	}
}
