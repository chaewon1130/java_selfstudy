package Ch11;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("990925-1012999");
		System.out.println(sb.replace(6, 7, " ").toString());
	}

}
