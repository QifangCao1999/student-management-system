package com.alex.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;
    private String message;
    private Map<String, Object> extend = new HashMap<String, Object>();

    public static Msg success() {
        Msg result = new Msg();
        result.setCode(100);
        result.setMessage("Success!");
        return result;
    }

    public static Msg fail() {
        Msg result = new Msg();
        result.setCode(200);
        result.setMessage("Failed");
        return result;
    }

    public Msg add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
