package mypack;

import org.springframework.stereotype.Component;

@Component(value="sample1")
public class Sample1 
{
	private String uname,pwd;

	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("inside setUname of Sample1");
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
		System.out.println("inside setPwd of Sample1");
	}
	
}
