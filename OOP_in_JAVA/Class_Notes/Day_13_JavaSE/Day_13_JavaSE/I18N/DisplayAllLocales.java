import java.util.*;
import java.text.*;
public class DisplayAllLocales
{
	public static void main(String args[])
	{
	Locale locales[]=DateFormat.getAvailableLocales();
for(Locale loc:locales)
{
	System.out.println(loc.getDisplayName()+"\t"+loc.getLanguage()+"\t"+loc.getCountry());
}
	}
}