package com.wise.repo;

import com.wise.entity.NationalRegSurveyQuestions;
import com.wise.entity.NationalRegSurveyQuestionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalRegSurveyQuestionsRepository extends JpaRepository<NationalRegSurveyQuestions, NationalRegSurveyQuestionsId> {

}
