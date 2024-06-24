package com.bittercode.model;

import org.checkerframework.checker.nullness.qual.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {

    private @MonotonicNonNull String emailId;
    private @MonotonicNonNull String password;
    private @MonotonicNonNull String firstName;
    private @MonotonicNonNull String lastName;
    private @MonotonicNonNull Long phone;
    private @MonotonicNonNull String address;
    private @MonotonicNonNull List<UserRole> roles;
    
    @RequiresNonNull("this.emailId") public String getEmailId() {
        return emailId;
    }

    @EnsuresNonNull({"this.emailId"}) public void setEmailId(String emailId) {
        this.emailId = Objects.requireNonNullElse(emailId, "null");
    }

    @RequiresNonNull({"this.password"})public String getPassword() {
        return password;
    }

    @EnsuresNonNull({"this.password"})public void setPassword(String password) {
        this.password = Objects.requireNonNullElse(password, "null");
    }

    @RequiresNonNull({"this.firstName"}) public String getFirstName() {
        return firstName;
    }

    @EnsuresNonNull({"this.firstName"})public void setFirstName(@Nullable String firstName) {
        this.firstName = Objects.requireNonNullElse(firstName, "null");
    }

    @RequiresNonNull({"this.lastName"}) public String getLastName() {
        return lastName;
    }

    @EnsuresNonNull({"this.lastName"})public void setLastName(@Nullable String lastName) {
        this.lastName = Objects.requireNonNullElse(lastName, "null");
    }

    @RequiresNonNull({"this.phone"}) public Long getPhone() {
        return phone;
    }

    @EnsuresNonNull({"this.phone"})public void setPhone(Long phone) {
        this.phone = Objects.requireNonNullElse(phone, 0L);
    }

    @RequiresNonNull({"this.address"}) public String getAddress() {
        return address;
    }

    @EnsuresNonNull({"this.address"})public void setAddress(String address) {
        this.address = Objects.requireNonNullElse(address, "null");
    }

    @RequiresNonNull({"this.roles"}) public List<UserRole> getRoles() {
        return roles;
    }

    @EnsuresNonNull({"this.roles"})public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

//    public static User retrieveFromHttpServletRequest(HttpServletRequest req) {
//        User user = new User();
//        String pWord = req.getParameter(UsersDBConstants.COLUMN_PASSWORD);
//        String fName = req.getParameter(UsersDBConstants.COLUMN_FIRSTNAME);
//        String lName = req.getParameter(UsersDBConstants.COLUMN_LASTNAME);
//        String addr = req.getParameter(UsersDBConstants.COLUMN_ADDRESS);
//        String phNo = req.getParameter(UsersDBConstants.COLUMN_PHONE);
//        String mailId = req.getParameter(UsersDBConstants.COLUMN_MAILID);
//        user.setEmailId(mailId);
//        user.setFirstName(fName);
//        user.setLastName(lName);
//        user.setPassword(pWord);
//        user.setPhone(Long.parseLong(phNo));
//        user.setAddress(addr);
//        return user;
//    }
}
