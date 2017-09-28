package com;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Entity;

@Entity
@Table(name="Order")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String siteID;
	private String userID;
	private String originatingSystem;
	private String channelID;
	private String locationCode;
	private String status;
	private Double orderAmount;
	private Double orderTax;
	private Double orderDiscount;
	private Double securityDepositAmount;
	private String serviceZip;
	private String outletID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getOriginatingSystem() {
		return originatingSystem;
	}

	public void setOriginatingSystem(String originatingSystem) {
		this.originatingSystem = originatingSystem;
	}

	public String getChannelID() {
		return channelID;
	}

	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getOrderTax() {
		return orderTax;
	}

	public void setOrderTax(Double orderTax) {
		this.orderTax = orderTax;
	}

	public Double getOrderDiscount() {
		return orderDiscount;
	}

	public void setOrderDiscount(Double orderDiscount) {
		this.orderDiscount = orderDiscount;
	}

	public Double getSecurityDepositAmount() {
		return securityDepositAmount;
	}

	public void setSecurityDepositAmount(Double securityDepositAmount) {
		this.securityDepositAmount = securityDepositAmount;
	}

	public String getServiceZip() {
		return serviceZip;
	}

	public void setServiceZip(String serviceZip) {
		this.serviceZip = serviceZip;
	}

	public String getOutletID() {
		return outletID;
	}

	public void setOutletID(String outletID) {
		this.outletID = outletID;
	}

}
