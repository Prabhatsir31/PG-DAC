package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
            Company c1=new Company();
            Account a1=new Account();
            a1.setBalance(20000);
            c1.setName("capgemini");
            c1.setLocation("mumbai");
            c1.setAcc(a1);
            a1.setCompany(c1);
            session.persist(c1); 
	   tr.commit();
			  
            System.out.println("done with company");  
            System.out.println("from company get account");
           Company ref1=session.get(Company.class,Integer.valueOf(1));
            System.out.println("Company is\t"+ref1.getName());
            System.out.println("Account is\t"+ref1.getAcc().getBalance());
            
            System.out.println("now from account get company");
           
          Account ref2=session.get(Account.class,Integer.valueOf(1));
            System.out.println("Account is\t"+ref2.getBalance());
            System.out.println("Company is\t"+ref2.getCompany().getName());
           
}
}





