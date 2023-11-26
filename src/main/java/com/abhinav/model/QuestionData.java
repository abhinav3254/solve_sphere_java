package com.abhinav.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
public class QuestionData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionName;
    private String problemLink;
    private String topicName;
    private String newTopicLearnt;
    private String status;
    private String revision;
    private String platform;
    private String optimizedSolution;
    private String type;
    private String beatsInTime;
    private String beatsInSpace;
    private String comments;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
