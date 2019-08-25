package usingXMLConfig;

public class BeanClass {
	private String driver;
	private String url;
	private String un;
	private String pwd;
	public BeanClass() {
		super();
	}
	@Override
	public String toString() {
		return "BeanClass [driver=" + driver + ", url=" + url + ", un=" + un + ", pwd=" + pwd + "]";
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
