import java.io.*;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;
	public StringDisplay(String string) {
		this.string = string;
		try {
			this.width = string.getBytes("Shift_JIS").length;
		} catch(UnsupportedEncodingException e) {
			System.out.println("Unsuppoerted Encoding");
		}
	}
	public void open() {
		printLine();
	}
	public void print() {
		System.out.println("|" + string + "|");
	}
	public void close() {
		printLine();
	}
	public void printLine() {
		System.out.print("+");
		for (int i = 0;  i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}