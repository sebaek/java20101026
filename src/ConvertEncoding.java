import java.io.File;

public class ConvertEncoding {
	public static void main(String[] args) {
		File curr = new File("src");
		System.out.println(curr.getAbsolutePath());
		System.out.println(curr.exists());
	}
}
