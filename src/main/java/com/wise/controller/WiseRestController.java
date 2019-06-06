package com.wise.controller;

import com.wise.entity.*;
import com.wise.repo.*;
import com.wise.service.CustomerService;
import com.wise.util.DBConnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/wise")
@CrossOrigin(origins = "*", maxAge = 4800, allowCredentials = "false")
public class WiseRestController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private DBConnUtil dbConnUtil;

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private CertificateRegProfileRepository certificateRegProfileRepository;

    @Autowired
    private NationalRegProfileRepository nationalRegProfileRepository;

    @Autowired
    private NationalRegSurveyRepository nationalRegSurveyRepository;

    @Autowired
    private NationalRegSurveyQuestionsRepository nationalRegSurveyQuestionsRepository;

    @RequestMapping(value="/test/{testid}", method = RequestMethod.GET, headers =  "Accept=application/json")
    @ResponseBody
    public String test(@PathVariable String testid) {
        dbConnUtil.checkDatabaseConnection();
        Profile profile = profileRepository.findByFirstName("ABC");
        System.out.println("received profile as :"+profile);
        return "fetching the customer info for -"+testid;
    }

    @RequestMapping(value =  "/insert/profile", method = RequestMethod.POST, headers =  "Accept=application/json")
    @ResponseBody
    public void insertNewProfileData(@RequestBody Profile profile) throws Exception {
        System.out.println("insert profile begins ...");
        try {
             profileRepository.save(profile);
        } catch (Exception e) {
            System.out.println("Exception while insert " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    @PostMapping(value =  "/certificateRegProfile")
    public CertificateRegProfile createCertificateRegProfile(@RequestBody CertificateRegProfile certificateRegProfile) {
        System.out.println("insert CertificateRegProfile begins ...");
        return certificateRegProfileRepository.save(certificateRegProfile);
    }

    @GetMapping(value =  "/certificateRegProfile")
    public List<CertificateRegProfile> getAllCertificateRegProfile()  {
        System.out.println("get all CertificateRegProfile begins ...");
        return certificateRegProfileRepository.findAll();
    }

    @GetMapping("/certificateRegProfile/{institutionName}/{institutionState}/{studentId}")
    public CertificateRegProfile getCertificateRegProfileById(@PathVariable String institutionName, @PathVariable String institutionState, @PathVariable String studentId)  {
        System.out.println("get certificateRegProfile by Id begins ...");
        Optional<CertificateRegProfile> certificateRegProfileOptional= certificateRegProfileRepository.findById(new CertificateRegProfileId(institutionName,institutionState, studentId));
        if(certificateRegProfileOptional.isPresent()){
            return certificateRegProfileOptional.get();
        }
        return null;
    }

    @PutMapping("/certificateRegProfile/{institutionName}/{institutionState}/{studentId}")
    public CertificateRegProfile updateCertificateRegProfileById( @RequestBody CertificateRegProfile certificateRegProfile, @PathVariable String institutionName, @PathVariable String institutionState,@PathVariable String studentId)  {
        System.out.println("update CertificateRegProfile begins ...");
        CertificateRegProfile existingCertificateRegProfile= getCertificateRegProfileById(institutionName, institutionState,studentId);
        if(existingCertificateRegProfile!=null){
            existingCertificateRegProfile.setBirthDate(certificateRegProfile.getBirthDate());
            existingCertificateRegProfile.setCertificateNumber(certificateRegProfile.getCertificateNumber());
            existingCertificateRegProfile.setFirstName(certificateRegProfile.getFirstName());
            existingCertificateRegProfile.setLastName(certificateRegProfile.getLastName());
            existingCertificateRegProfile.setGender(certificateRegProfile.getGender());
            existingCertificateRegProfile.setGrade(certificateRegProfile.getGrade());
            existingCertificateRegProfile.setTestDate(certificateRegProfile.getTestDate());
            existingCertificateRegProfile.setResultId(certificateRegProfile.getResultId());
            existingCertificateRegProfile.setPassFail(certificateRegProfile.getPassFail());
            existingCertificateRegProfile.setScore(certificateRegProfile.getScore());
            return existingCertificateRegProfile;
        }
        return null;
    }


    @PostMapping(value =  "/nationalRegProfile")
    public NationalRegProfile createNationalRegProfile(@RequestBody NationalRegProfile nationalRegProfile) {
        System.out.println("insert NationalRegProfile begins ...");
        return nationalRegProfileRepository.save(nationalRegProfile);
    }

    @GetMapping(value =  "/nationalRegProfile")
    public List<NationalRegProfile> getAllNationalRegProfile()  {
        System.out.println("get all NationalRegProfile begins ...");
        return nationalRegProfileRepository.findAll();
    }

    @GetMapping("/nationalRegProfile/{personId}")
    public NationalRegProfile getNationalRegProfileById(@PathVariable int personId )  {
        System.out.println("get NationalRegProfile by ID begins ...");
        Optional<NationalRegProfile> nationalRegProfileOpt= nationalRegProfileRepository.findById(personId);
        if(nationalRegProfileOpt.isPresent()){
            return nationalRegProfileOpt.get();
        }
        return null;
    }

    @PutMapping("/nationalRegProfile/{personId}")
    public NationalRegProfile updateNationalRegProfile( @RequestBody NationalRegProfile nationalRegProfile, @PathVariable int personId)  {
        System.out.println("update NationalRegProfile begins ...");
        NationalRegProfile existingNationalRegProfile= getNationalRegProfileById(personId);
        if(existingNationalRegProfile!=null){
            existingNationalRegProfile.setAddress(nationalRegProfile.getAddress());
            existingNationalRegProfile.setCollegeName(nationalRegProfile.getCollegeName());
            existingNationalRegProfile.setFirstName(nationalRegProfile.getFirstName());
            existingNationalRegProfile.setLastName(nationalRegProfile.getLastName());
            existingNationalRegProfile.setGender(nationalRegProfile.getGender());
            existingNationalRegProfile.setCurrentJobOrg(nationalRegProfile.getCurrentJobOrg());
            existingNationalRegProfile.setCurrentJobTitle(nationalRegProfile.getCurrentJobTitle());
            existingNationalRegProfile.setEmailId(nationalRegProfile.getEmailId());
            existingNationalRegProfile.setHighestLevelOfEducation(nationalRegProfile.getHighestLevelOfEducation());
            existingNationalRegProfile.setHighschoolName(nationalRegProfile.getHighschoolName());
            existingNationalRegProfile.setPhoneNumber(nationalRegProfile.getPhoneNumber());
            existingNationalRegProfile.setStudentId(nationalRegProfile.getStudentId());
            existingNationalRegProfile.setDateOfBirth(nationalRegProfile.getDateOfBirth());
            existingNationalRegProfile.setYearOfFLCPassed(nationalRegProfile.getYearOfFLCPassed());
            existingNationalRegProfile.setYearOfGraduation(nationalRegProfile.getYearOfGraduation());
            return existingNationalRegProfile;
        }
        return null;
    }

    @PostMapping(value =  "/nationalRegSurvey")
    public NationalRegSurvey createNationalRegSurvey(@RequestBody NationalRegSurvey nationalRegSurvey) {
        System.out.println("insert NationalRegSurvey begins ...");
        return nationalRegSurveyRepository.save(nationalRegSurvey);
    }

    @GetMapping(value =  "/nationalRegSurvey")
    public List<NationalRegSurvey> getAllNationalRegSurvey()  {
        System.out.println("get all NationalRegSurvey begins ...");
        return nationalRegSurveyRepository.findAll();
    }

    @GetMapping("/nationalRegSurvey/{personId}/{surveyId}/{surveyDate}")
    public NationalRegSurvey getNationalRegProfileById(@PathVariable int personId, @PathVariable int surveyId, @PathVariable int questionId, @PathVariable Date surveyDate )  {
        System.out.println("get NationalRegSurvey by ID begins ...");
        Optional<NationalRegSurvey> nationalRegSurveyOpt= nationalRegSurveyRepository.findById(new NationalRegSurveyId(personId,surveyId,questionId,surveyDate));
        if(nationalRegSurveyOpt.isPresent()){
            return nationalRegSurveyOpt.get();
        }
        return null;
    }

    @PutMapping("/nationalRegSurvey/{personId}/{surveyId}/{surveyDate}")
    public NationalRegSurvey updateNationalRegSurvey( @RequestBody NationalRegSurvey nationalRegSurvey, @PathVariable int personId, @PathVariable int surveyId, @PathVariable int questionId, @PathVariable Date surveyDate )  {
        System.out.println("update NationalRegSurvey begins ...");
        NationalRegSurvey existingNationalRegSurvey= getNationalRegProfileById(personId, surveyId, questionId, surveyDate);
        if(existingNationalRegSurvey!=null){
            existingNationalRegSurvey.setQuestionAnswer(nationalRegSurvey.getQuestionAnswer());
            return existingNationalRegSurvey;
        }
        return null;
    }


    @PostMapping(value =  "/nationalRegSurveyQuestions")
    public NationalRegSurveyQuestions createNationalRegSurveyQuestions(@RequestBody NationalRegSurveyQuestions nationalRegSurveyQuestions) {
        System.out.println("insert NationalRegSurveyQuestions begins ...");
        return nationalRegSurveyQuestionsRepository.save(nationalRegSurveyQuestions);
    }

    @GetMapping(value =  "/nationalRegSurveyQuestions")
    public List<NationalRegSurveyQuestions> getAllNationalRegSurveyQuestions()  {
        System.out.println("get all NationalRegSurveyQuestions begins ...");
        return nationalRegSurveyQuestionsRepository.findAll();
    }

    @GetMapping("/nationalRegSurveyQuestions/{questionId}/{surveyId}")
    public NationalRegSurveyQuestions getNationalRegProfileById( @PathVariable int questionId, @PathVariable int surveyId )  {
        System.out.println("get NationalRegSurveyQuestions by ID  begins ...");
        Optional<NationalRegSurveyQuestions> nationalRegSurveyOpt= nationalRegSurveyQuestionsRepository.findById(new NationalRegSurveyQuestionsId(questionId,surveyId));
        if(nationalRegSurveyOpt.isPresent()){
            return nationalRegSurveyOpt.get();
        }
        return null;
    }

    @PutMapping("/nationalRegSurveyQuestions/{questionId}/{surveyId}")
    public NationalRegSurveyQuestions updateNationalRegSurveyQuestions( @RequestBody NationalRegSurveyQuestions nationalRegSurveyQuestions,  @PathVariable int questionId, @PathVariable int surveyId )  {
        System.out.println("update NationalRegSurveyQuestions begins ...");
        NationalRegSurveyQuestions existingNationalRegSurveyQuestions=getNationalRegProfileById( questionId, surveyId);
        if(existingNationalRegSurveyQuestions!=null){
            existingNationalRegSurveyQuestions.setCreatedOn(nationalRegSurveyQuestions.getCreatedOn());
            existingNationalRegSurveyQuestions.setQuestionAnswerOptions(nationalRegSurveyQuestions.getQuestionAnswerOptions());
            existingNationalRegSurveyQuestions.setQuestionDetails(nationalRegSurveyQuestions.getQuestionDetails());
            existingNationalRegSurveyQuestions.setQuestionType(nationalRegSurveyQuestions.getQuestionType());
            existingNationalRegSurveyQuestions.setUpdatedBy(nationalRegSurveyQuestions.getUpdatedBy());
            existingNationalRegSurveyQuestions.setUpdatedOn(nationalRegSurveyQuestions.getUpdatedOn());
            return existingNationalRegSurveyQuestions;
        }
        return null;
    }
}
