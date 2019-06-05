package com.wise.service;

import com.wise.pojo.AccountPojo;
import com.wise.pojo.CustomerPojo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerPojo getCustomerInfo(String customerId){

        if("ABC123".equals(customerId)) {
            CustomerPojo customerPojo = new CustomerPojo();
            customerPojo.setCustomerId(customerId);
            customerPojo.setCustomerName("Test Customer");
            customerPojo.setAccountPojo(getCustomerAccountDetails(customerId));
            return customerPojo;
        }else{
            throw new IllegalArgumentException("Customer not found");
        }
    }

    private AccountPojo getCustomerAccountDetails(String customerId) {
        if("ABC123".equals(customerId)) {
           AccountPojo accountPojo = new AccountPojo();
           accountPojo.setAccountId(121231121);
           accountPojo.setAccountType("Checking");
           accountPojo.setBalance(232322232.23);
           return accountPojo;
        }else{
            throw new IllegalArgumentException("Customer not found");
        }
    }

}
