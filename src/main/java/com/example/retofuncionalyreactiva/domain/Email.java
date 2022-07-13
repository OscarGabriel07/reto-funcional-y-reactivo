package com.example.retofuncionalyreactiva.domain;

public class Email {

    private String emailValue;
    private Boolean isSend;

    public Email(String emailValue, Boolean isSend) {
        this.emailValue = emailValue;
        this.isSend = isSend;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public Boolean getSend() {
        return isSend;
    }

    public void setSend(Boolean send) {
        isSend = send;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailValue='" + emailValue + '\'' +
                ", isSend=" + isSend +
                '}';
    }
}
