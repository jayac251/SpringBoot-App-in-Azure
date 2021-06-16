package com.example.ccvalidation.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CREDITCARDINFO")
public class CreditCardInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sNo;
	private String ssn;
	/**
	 * @return the sNo
	 */
	public Integer getsNo() {
		return sNo;
	}

	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	private String firstName;
	private String lastName;
	private String ccnumber;
	private Integer creditrating;
	private String status;

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the ccnumber
	 */
	public String getCcnumber() {
		return ccnumber;
	}

	/**
	 * @param ccnumber the ccnumber to set
	 */
	public void setCcnumber(String ccnumber) {
		this.ccnumber = ccnumber;
	}

	/**
	 * @return the creditrating
	 */
	public Integer getCreditrating() {
		return creditrating;
	}

	/**
	 * @param creditrating the creditrating to set
	 */
	public void setCreditrating(Integer creditrating) {
		this.creditrating = creditrating;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}