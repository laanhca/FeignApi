package com.av.api;

import java.util.List;

public class CheckOrderResults {

    private String phoneNumber;
    private String statusString;
    private int status;

    private List<Messages> messages = null;

    private String updated;

    private int connectedGsmDeviceId;

    private Boolean success;

    private String message;


    public CheckOrderResults(){}

    public CheckOrderResults(String phoneNumber, String statusString, int status, List<Messages> messages, String updated, int connectedGsmDeviceId, Boolean success, String message) {
        this.phoneNumber = phoneNumber;
        this.statusString = statusString;
        this.status = status;
        this.messages = messages;
        this.updated = updated;
        this.connectedGsmDeviceId = connectedGsmDeviceId;
        this.success = success;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Messages> getMessages() {
        return messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public int getConnectedGsmDeviceId() {
        return connectedGsmDeviceId;
    }

    public void setConnectedGsmDeviceId(int connectedGsmDeviceId) {
        this.connectedGsmDeviceId = connectedGsmDeviceId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
