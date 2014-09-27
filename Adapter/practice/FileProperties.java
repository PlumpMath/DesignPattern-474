import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
	private Properties configration;

	private String year;
	private String month;
	private String day;

	public FileProperties() {
		this.configration = new Properties();
	}

	public void readFromFile(String filename) throws IOException {
		InputStream inStream = new FileInputStream(new File(filename));
		configration.load(inStream);
		year = configration.getProperty("year");
	}
	public void writeToFile(String filename) throws IOException {
	  configration.store(new FileOutputStream(filename), "written by FileProperties");
	}
	public void setValue(String key, String value) {
		configration.setProperty(key, value);
	}
	public String getValue(String key) {
		return configration.getProperty(key);
	}

}