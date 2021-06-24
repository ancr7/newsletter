package com.ayush.newsletter.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
  @Id
  private String emailId;
  private String name;
  private long phoneNo;

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(final String emailId) {
    this.emailId = emailId;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public long getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(final long phoneNo) {
    this.phoneNo = phoneNo;
  }

  @Override
  public String toString() {
    return "User{" + "emailId='" + emailId + '\'' + ", name='" + name + '\'' + ", phoneNo="
        + phoneNo + '}';
  }
}
