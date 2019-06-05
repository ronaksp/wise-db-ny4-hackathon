package com.wise.controller;

import com.wise.entity.Profile;
import com.wise.repo.ProfileRepository;
import com.wise.service.CustomerService;
import com.wise.util.DBConnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wise")
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @Autowired
    DBConnUtil dbConnUtil;

    @Autowired
    ProfileRepository profileRepository;
//    @RequestMapping(value="/get/customer-info/{customerId}", method = RequestMethod.GET, headers = "Accept=application/json")
//    @ResponseBody
//    public CustomerPojo getCustomerInfo(@PathVariable String customerId) {
//        return customerService.getCustomerInfo(customerId);
//    }

    @RequestMapping("/test/{testid}")
    @ResponseBody
    public String test(@PathVariable String testid) {
        dbConnUtil.checkDatabaseConnection();
        Profile profile = profileRepository.findByFirstName("ABC");
        System.out.println("received profile as :"+profile);
        return "fetching the customer info for -"+testid;
    }

    @RequestMapping(value =  "/insert/profile", method = RequestMethod.POST, headers =  "Accept=application/json")
    @ResponseBody
    public void updateScenarioMapping(@RequestBody Profile profile) throws Exception {
        System.out.println("insert profile begins ...");
        try {
             profileRepository.save(profile);
        } catch (Exception e) {
            System.out.println("Exception while insert " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

}
