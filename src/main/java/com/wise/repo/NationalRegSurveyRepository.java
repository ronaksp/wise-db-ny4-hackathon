package com.wise.repo;

import com.wise.entity.NationalRegSurvey;
import com.wise.entity.NationalRegSurveyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalRegSurveyRepository extends JpaRepository<NationalRegSurvey, NationalRegSurveyId> {

}
