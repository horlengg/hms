package com.rupp.hrms.dto.response;

import java.util.Date;

/**
 * EmployeeReponseDTO
 */
public class UserDetailReponseDTO {

    private String fullName;
    private String gender;
    private String dob;
    private String phone;
    private Boolean isDeleted;
    private String profileImage;
    private String placeOfBirth;
    private String maritalStatus;
    private String userType;
    private UserDetailReponseDTO updatedBy;
    private UserDetailReponseDTO createdBy;
    private Date createdAt;
    private Date updatedAt;
    private String possition;
    private Date jointDate;
    private Date contractEndDate;

    public UserDetailReponseDTO(){};
    
    public UserDetailReponseDTO(
            String fullName, 
            String gender, 
            String dob, 
            String phone, 
            Boolean isDeleted,
            String profileImage, 
            String placeOfBirth, 
            String maritalStatus,
            String userType,
            UserDetailReponseDTO updatedBy, 
            UserDetailReponseDTO createdBy, 
            Date createdAt, 
            Date updatedAt,
            EmployeeResponseDTO employee
        ) {
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.phone = phone;
        this.isDeleted = isDeleted;
        this.profileImage = profileImage;
        this.placeOfBirth = placeOfBirth;
        this.maritalStatus = maritalStatus;
        this.userType = userType;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
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

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public String getProfileImage() {
        return profileImage;
    }
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public UserDetailReponseDTO getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(UserDetailReponseDTO updatedBy) {
        this.updatedBy = updatedBy;
    }
    public UserDetailReponseDTO getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(UserDetailReponseDTO createdBy) {
        this.createdBy = createdBy;
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