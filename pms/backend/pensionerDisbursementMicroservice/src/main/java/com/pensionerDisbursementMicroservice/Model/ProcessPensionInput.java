package com.pensionerDisbursementMicroservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProcessPensionInput {

	private Long adhaar;
	private Double pensionAmount;
	private double serviceCharge;

	public Long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(Long adhaar) {
		this.adhaar = adhaar;
	}

	public Double getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(Double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
}
