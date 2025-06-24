package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Question q1=new Question();
		Answer a1=new Answer();
		Answer a2=new Answer();
		Answer a3=new Answer();
		List<Answer>anslist=new ArrayList<>();
		q1.setQuest("What is Cricket");
		a1.setReply("Cricket is one of the sports types");
		a1.setQuestion(q1);
		a2.setReply("Cricket is very interesting");
		a2.setQuestion(q1);
		a3.setReply("Cricket is a religion in India");
		a3.setQuestion(q1);
		anslist.add(a1);
		anslist.add(a2);
		anslist.add(a3);
		q1.setAns(anslist);
		
		session.persist(q1);
		tr.commit();
		System.out.println("Done with question");
		System.out.println("Let's retrieve the answers from a question");
		
		Question ref1=session.get(Question.class,1);
		System.out.println("Question is\t"+ref1.getQuest());
		System.out.println("Answers are ");
		for(Answer k:ref1.getAns())
		{
			System.out.println(k.getReply());
		}
		System.out.println();
		System.out.println("Let's retrieve the question from the answers");
		Answer ans1=session.get(Answer.class,1);
		System.out.println("Answer\t"+ans1.getReply()+"\t\t\tQuestion\t"+ans1.getQuestion().getQuest());

		Answer ans2=session.get(Answer.class,2);
		System.out.println("Answer\t"+ans2.getReply()+"\t\t\tQuestion\t"+ans2.getQuestion().getQuest());
		
		Answer ans3=session.get(Answer.class,3);
		System.out.println("Answer\t"+ans3.getReply()+"\t\t\tQuestion\t"+ans3.getQuestion().getQuest());
		}
}
