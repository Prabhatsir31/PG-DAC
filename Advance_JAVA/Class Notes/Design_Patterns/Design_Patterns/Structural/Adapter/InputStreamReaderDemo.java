package trial;

import java.io.IOException;
import java.io.InputStreamReader;
public class InputStreamReaderDemo
{
	public static void main(String ...arg)
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		String str=null;
		char k=' ';
		try {
			k=(char) ir.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(k);
	}
}

