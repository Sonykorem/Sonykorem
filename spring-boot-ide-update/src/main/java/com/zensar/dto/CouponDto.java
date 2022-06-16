package com.zensar.dto;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String couponexpDate;
	public CouponDto() {
		super();
	}
	public CouponDto(int couponId, String couponCode, String couponexpDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponexpDate = couponexpDate;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getCouponexpDate() {
		return couponexpDate;
	}
	public void setCouponexpDate(String couponexpDate) {
		this.couponexpDate = couponexpDate;
	}
	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponexpDate=" + couponexpDate
				+ "]";
	}
	
}
