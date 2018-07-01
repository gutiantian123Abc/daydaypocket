package com.daypocket.xiangtiangu.daydaypocket;


import com.google.gson.JsonObject;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.json.JSONObject;



public class Util {

    public static String getProperty(String key,Context context) throws IOException {
        Properties properties = new Properties();;
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("Config.properties");
        properties.load(inputStream);
        return properties.getProperty(key);

    }

    public Customer jsonToCustomer(JsonObject jsonObject) {
        //Replace these to a property file
        String userName = format(jsonObject.get("userName").toString());
        String password = format(jsonObject.get("password").toString());
        String email = format(jsonObject.get("email").toString());
        String borrowBalance = format(jsonObject.get("borrowBalance").toString());
        String investmentBalance = format(jsonObject.get("investmentBalance").toString());
        String job = format(jsonObject.get("job").toString());
        String ssn = format(jsonObject.get("ssn").toString());
        String firstName = format(jsonObject.get("firstName").toString());
        String lastName = format(jsonObject.get("lastName").toString());
        String address = format(jsonObject.get("address").toString());
        String income = format(jsonObject.get("income").toString());
        String creditScore = format(jsonObject.get("creditScore").toString());
        String paypalAccount = format(jsonObject.get("paypalAccount").toString());
        String maxBorrowLine = format(jsonObject.get("maxBorrowLine").toString());
        String borrowRate = format(jsonObject.get("borrowRate").toString());
        String investRate = format(jsonObject.get("investRate").toString());

        Customer customer = new Customer();
        customer.setUserName(userName);
        customer.setPassword(password);
        customer.setEmail(email);
        customer.setBorrowBalance(borrowBalance);
        customer.setInvestmentBalance(investmentBalance);
        customer.setJob(job);
        customer.setSsn(ssn);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAddress(address);
        customer.setIncome(income);
        customer.setCreditScore(creditScore);
        customer.setPaypalAccount(paypalAccount);
        customer.setMaxBorrowLine(maxBorrowLine);
        customer.setBorrowRate(borrowRate);
        customer.setInvestRate(investRate);

        return customer;
    }


    public JSONObject customerToJson(Customer customer) {
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("userName", customer.getUserName());
            jsonObject.put("password", customer.getPassword());
            jsonObject.put("email", customer.getEmail());
            jsonObject.put("borrowBalance", customer.getBorrowBalance());
            jsonObject.put("investmentBalance", customer.getInvestmentBalance());
            jsonObject.put("job", customer.getJob());
            jsonObject.put("ssn", customer.getSsn());
            jsonObject.put("firstName", customer.getFirstName());
            jsonObject.put("lastName", customer.getLastName());
            jsonObject.put("address", customer.getAddress());
            jsonObject.put("income", customer.getIncome());
            jsonObject.put("creditScore", customer.getCreditScore());
            jsonObject.put("paypalAccount", customer.getPaypalAccount());
            jsonObject.put("maxBorrowLine", customer.getMaxBorrowLine());
            jsonObject.put("borrowRate", customer.getBorrowRate());
            jsonObject.put("investRate", customer.getInvestRate());
        }catch (Exception e) {
            Log.d("customer to json", e.getLocalizedMessage());
        }

        return jsonObject;
    }



    public boolean equal(String a, String b) {
        return (format(a)).equals(format(b));

    }

    public String format(String s) {
        return s.replaceAll("\"", "");
    }



}
