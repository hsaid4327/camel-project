package com.company;

import com.company.cusdec.CusdecBundle;

public class NetValueBean {
    protected double approvalThreshold;

    /**
     * Checks if total net amount is greater than approvalThreshold
     *
     * @return true if total net amount is greater than approvalThreshold, false otherwise
     */
    public boolean checkNetValueForApproval(CusdecBundle bundle) {
        return bundle.getDocuments().get(0).getTotalNetAmount() > approvalThreshold;
    }

    public double getApprovalThreshold() {
        return approvalThreshold;
    }

    public void setApprovalThreshold(double approvalThreshold) {
        this.approvalThreshold = approvalThreshold;
    }
}
