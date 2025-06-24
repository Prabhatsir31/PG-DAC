package mypack;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qid;
	private String quest;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="question")
	private List<Answer> ans;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", quest=" + quest + ", ans=" + ans + "]";
	}

	
	
	
}
