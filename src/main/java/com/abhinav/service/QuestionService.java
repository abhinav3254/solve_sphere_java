package com.abhinav.service;

import com.abhinav.model.QuestionData;
import com.abhinav.repo.QuestionDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class QuestionService {

    @Autowired
    private QuestionDataRepo questionDataRepo;
    public ResponseEntity<String> addQuestion(QuestionData questionData) {
        try {

            questionData.setDate(new Date());
            questionDataRepo.save(questionData);
            return new ResponseEntity<>(HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
