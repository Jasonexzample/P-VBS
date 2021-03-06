package com.group.pbox.pvbs.model.acct;

import java.util.Date;

import com.group.pbox.pvbs.common.model.BasePage;

public class AccountMaster extends BasePage
{

    private String id;

    private String accountId;

    private String customerName;

    private String customerId;

    private Date dateOfBirth;

    private String address;

    private String contactAddress;

    private String contactNumber;

    private String wechatId;

    private String employment;

	private Account account;
    
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getContactAddress()
    {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress)
    {
        this.contactAddress = contactAddress;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }

    public String getWechatId()
    {
        return wechatId;
    }

    public void setWechatId(String wechatId)
    {
        this.wechatId = wechatId;
    }

    public String getEmployment()
    {
        return employment;
    }

    public void setEmployment(String employment)
    {
        this.employment = employment;
    }

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
