package com.abhinav.repo;

import com.abhinav.model.QuestionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDataRepo extends JpaRepository<QuestionData,Long> {
}
