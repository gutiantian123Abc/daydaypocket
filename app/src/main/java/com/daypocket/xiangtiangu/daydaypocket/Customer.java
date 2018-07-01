package com.daypocket.xiangtiangu.daydaypocket;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonObject;


public class Customer implements Parcelable {

    private String userName;
    private String password;
    private String email;
    private String borrowBalance;
    private String investmentBalance;
    private String job;
    private String ssn;
    private String firstName;
    private String lastName;
    private String address;
    private String income;
    private String creditScore;
    private String paypalAccount;
    private String maxBorrowLine;
    private String borrowRate;
    private String investRate;

    public Customer() {

    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBorrowBalance() {
        return borrowBalance;
    }

    public void setBorrowBalance(String borrowBalance) {
        this.borrowBalance = borrowBalance;
    }

    public String getInvestmentBalance() {
        return investmentBalance;
    }

    public void setInvestmentBalance(String investmentBalance) {
        this.investmentBalance = investmentBalance;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getPaypalAccount() {
        return paypalAccount;
    }

    public void setPaypalAccount(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }

    public String getMaxBorrowLine() {
        return maxBorrowLine;
    }

    public void setMaxBorrowLine(String maxBorrowLine) {
        this.maxBorrowLine = maxBorrowLine;
    }

    public String getBorrowRate() {
        return borrowRate;
    }

    public void setBorrowRate(String borrowRate) {
        this.borrowRate = borrowRate;
    }

    public String getInvestRate() {
        return investRate;
    }

    public void setInvestRate(String investRate) {
        this.investRate = investRate;
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userName", userName);
        jsonObject.addProperty("password", password);
        jsonObject.addProperty("email", email);
        jsonObject.addProperty("borrowBalance", borrowBalance);
        jsonObject.addProperty("investmentBalance", investmentBalance);
        jsonObject.addProperty("job", job);
        jsonObject.addProperty("ssn", ssn);
        jsonObject.addProperty("firstName", firstName);
        jsonObject.addProperty("lastName", lastName);
        jsonObject.addProperty("address", address);
        jsonObject.addProperty("income", income);
        jsonObject.addProperty("creditScore", creditScore);
        jsonObject.addProperty("paypalAccount", paypalAccount);
        jsonObject.addProperty("maxBorrowLine", maxBorrowLine);
        jsonObject.addProperty("borrowRate", borrowRate);
        jsonObject.addProperty("investRate", investRate);

        return jsonObject;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", borrowBalance='" + borrowBalance + '\'' +
                ", investmentBalance='" + investmentBalance + '\'' +
                ", job='" + job + '\'' +
                ", ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", income='" + income + '\'' +
                ", creditScore='" + creditScore + '\'' +
                ", paypalAccount='" + paypalAccount + '\'' +
                ", maxBorrowLine='" + maxBorrowLine + '\'' +
                ", borrowRate='" + borrowRate + '\'' +
                ", investRate='" + investRate + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userName);
        dest.writeString(this.password);
        dest.writeString(this.email);
        dest.writeString(this.borrowBalance);
        dest.writeString(this.investmentBalance);
        dest.writeString(this.job);
        dest.writeString(this.ssn);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.address);
        dest.writeString(this.income);
        dest.writeString(this.creditScore);
        dest.writeString(this.paypalAccount);
        dest.writeString(this.maxBorrowLine);
        dest.writeString(this.borrowRate);
        dest.writeString(this.investRate);
    }

    protected Customer(Parcel in) {
        this.userName = in.readString();
        this.password = in.readString();
        this.email = in.readString();
        this.borrowBalance = in.readString();
        this.investmentBalance = in.readString();
        this.job = in.readString();
        this.ssn = in.readString();
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.address = in.readString();
        this.income = in.readString();
        this.creditScore = in.readString();
        this.paypalAccount = in.readString();
        this.maxBorrowLine = in.readString();
        this.borrowRate = in.readString();
        this.investRate = in.readString();
    }

    public static final Parcelable.Creator<Customer> CREATOR = new Parcelable.Creator<Customer>() {
        @Override
        public Customer createFromParcel(Parcel source) {
            return new Customer(source);
        }

        @Override
        public Customer[] newArray(int size) {
            return new Customer[size];
        }
    };
}