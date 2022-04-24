package io.zipcoder.tc_spring_poll_application;

import io.zipcoder.tc_spring_poll_application.Option;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll {
    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    Long id;

    @Column(name = "QUESTION")
    String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="POLL_ID")
    @OrderBy
    Set<Option> options;

    public Poll(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
