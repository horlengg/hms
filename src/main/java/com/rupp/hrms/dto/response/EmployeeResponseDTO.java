package com.rupp.hrms.dto.response;

import java.util.Date;

public class EmployeeResponseDTO {
    private String possition;
    private Date jointDate;
    private Date contractEndDate;
    private Boolean isDeleted;
    private Date createdAt;
    private Date updatedAt;
    public EmployeeResponseDTO(){};
    public EmployeeResponseDTO(String possition, Date jointDate, Date contractEndDate, Boolean isDeleted,Date createdAt, Date updatedAt) {
        this.possition = possition;
        this.jointDate = jointDate;
        this.contractEndDate = contractEndDate;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public String getPossition() {
        return possition;
    }
    public void setPossition(String possition) {
        this.possition = possition;
    }
    public Date getJointDate() {
        return jointDate;
    }
    public void setJointDate(Date jointDate) {
        this.jointDate = jointDate;
    }
    public Date getContractEndDate() {
        return contractEndDate;
    }
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Date getcreatedAt() {
        return createdAt;
    }
    public void setcreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getupdatedAt() {
        return updatedAt;
    }
    public void setupdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    
    
}
