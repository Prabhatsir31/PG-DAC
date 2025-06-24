package mypack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ansid;
	private String reply;
	
	@ManyToOne
	private Question question;
	
	public int getAnsid() {
		return ansid;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
}
