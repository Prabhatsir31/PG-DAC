import java.io.IOException;
import java.io.InputStreamReader;
public class InputStreamReaderDemo1
{
	public static void main(String ...arg)
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		char arr[]=new char[100];
		int k=0;
		try {
			k=ir.read(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(k);
		String str=new String(arr,0,k);
		System.out.println(str);
	}
}

