package com.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Embeddable
public class PersonId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	int id;
	
	@Column(name = "aadhaar")
	int aadhaar;
	
	@Column(name = "socialSecurityNumber")
	int socialSecurityNumber;
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the aadhaar
	 */
	public int getAadhaar() {
		return aadhaar;
	}

	/**
	 * @param aadhaar
	 *            the aadhaar to set
	 */
	public void setAadhaar(int aadhaar) {
		this.aadhaar = aadhaar;
	}

	/**
	 * @return the socialSecurityNumber
	 */
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * @param socialSecurityNumber
	 *            the socialSecurityNumber to set
	 */
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aadhaar;
		result = prime * result + id;
		result = prime * result + socialSecurityNumber;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonId other = (PersonId) obj;
		if (aadhaar != other.aadhaar)
			return false;
		if (id != other.id)
			return false;
		if (socialSecurityNumber != other.socialSecurityNumber)
			return false;
		return true;
	}

}
