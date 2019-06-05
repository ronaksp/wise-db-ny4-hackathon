package com.wise.pojo;

public class CustomerPojo {

    private String customerName;
    private String customerId;
    private AccountPojo accountPojo;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public AccountPojo getAccountPojo() {
        return accountPojo;
    }

    public void setAccountPojo(AccountPojo accountPojo) {
        this.accountPojo = accountPojo;
    }
}
