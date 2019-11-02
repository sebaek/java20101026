import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class ConvertEncoding {
	public static void main(String[] args) throws Exception {
		directory("src");
	}
	
	public static void directory(String path) throws Exception {
		File root = new File(path);
		
		File[] files = root.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				directory(file.getCanonicalPath());
			} else {
				String name = file.getCanonicalPath();
				if (name.substring(name.length() - 5).equals(".java")) {
//					System.out.println(name);
					JavaFile javafile = new JavaFile(name);
					javafile.convert();
				}
			}
		}
	}
}

class JavaFile {
	private File src;
	private File dest;
	private String path;
	JavaFile(String path) {
		this.path = path;
		this.src = new File(path);
		this.dest = new File(path + "2");
	}
	public void convert() throws Exception {
		Reader fr = new BufferedReader(new FileReader(src));
		char[] datas = new char[1024];
		dest.createNewFile();
		Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), StandardCharsets.UTF_8));

		int reads = 0;
		while ((reads = fr.read(datas)) != -1) {
			fw.write(datas, 0, reads);
		}
		
		fw.flush();
		fw.close();
		
		fr.close();
		
		src.delete();
		dest.renameTo(new File(path));
	}
}