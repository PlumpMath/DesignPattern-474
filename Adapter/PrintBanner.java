public class PrintBanner extends Banner implements Print {
	private String string;
	public PrintBanner(String string) {
		super(string);
	}
	public void printWeak() {
		super.showWithParen();
	}
	public void printStrong() {
		super.showWithAster();
	}
}