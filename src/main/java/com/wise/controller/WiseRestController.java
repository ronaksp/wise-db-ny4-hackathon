package com.wise.controller;

import com.wise.entity.CertificateRegProfile;
import com.wise.entity.CertificateRegProfileId;
import com.wise.entity.Profile;
import com.wise.repo.CertificateRegProfileRepository;
import com.wise.repo.ProfileRepository;
import com.wise.service.CustomerService;
import com.wise.util.DBConnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/wise")
public class WiseRestController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private DBConnUtil dbConnUtil;

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private CertificateRegProfileRepository certificateRegProfileRepository;
//    @RequestMapping(value="/get/customer-info/{customerId}", method = RequestMethod.GET, headers = "Accept=application/json")
//    @ResponseBody
//    public CustomerPojo getCustomerInfo(@PathVariable String customerId) {
//        return customerService.getCustomerInfo(customerId);
//    }

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
        System.out.println("get all CertificateRegProfile begins ...");
        Optional<CertificateRegProfile> certificateRegProfileOptional= certificateRegProfileRepository.findById(new CertificateRegProfileId(institutionName,institutionState, studentId));
        if(certificateRegProfileOptional.isPresent()){
            return certificateRegProfileOptional.get();
        }
        return null;
    }

    @PutMapping("/certificateRegProfile/{institutionName}/{institutionState}/{studentId}")
    public CertificateRegProfile updateCertificateRegProfileById( @RequestBody CertificateRegProfile certificateRegProfile, @PathVariable String institutionName, @PathVariable String institutionState,@PathVariable String studentId)  {
        System.out.println("get all CertificateRegProfile begins ...");
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



}
