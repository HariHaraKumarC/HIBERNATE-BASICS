package hari.edu.hibernate.pojo;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "questionName")
    String questionName;

    @Column(name = "questionPosterName")
    String questionPosterName;

    @ElementCollection
    @CollectionTable(name = "answers",joinColumns = @JoinColumn(name = "questionId",referencedColumnName = "id"))
    @MapKeyColumn(name = "answer")
    @Column(name = "answerPosterName")
    Map<String, String> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }

    public String getQuestionPosterName() {
        return questionPosterName;
    }

    public void setQuestionPosterName(String questionPosterName) {
        this.questionPosterName = questionPosterName;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionName='" + questionName + '\'' +
                ", questionPosterName='" + questionPosterName + '\'' +
                ", answers=" + answers +
                '}';
    }
}
