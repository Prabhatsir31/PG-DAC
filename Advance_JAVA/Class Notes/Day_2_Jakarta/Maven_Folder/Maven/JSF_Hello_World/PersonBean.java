package mypack;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "person")
public class PersonBean 
{
      private String name;

      public void setName(String name)
	 {
            this.name = name;
      }
      public String getName() 
	{
            return this.name;
      }
}
