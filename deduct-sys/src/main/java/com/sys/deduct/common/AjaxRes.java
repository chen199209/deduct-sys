package com.sys.deduct.common;

import java.io.Serializable;

public class AjaxRes implements Serializable {
    private static final long serialVersionUID = 1L;
    private int res = 1000001;
    private String resMsg;
    private Object obj;
    private String accessToken;
    private String accountId;
    private String returnUrl;

    public AjaxRes() {
    }

    public int getRes() {
        return this.res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getResMsg() {
        return this.resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public static long getSerialversionuid() {
        return 1L;
    }

    public boolean setNoAuth(boolean auth) {
        if (!auth) {
            this.obj = null;
            this.setRes(100);
            this.setResMsg("当前角色没有权限");
        }

        return auth;
    }

    public void setSucceed(Object obj, String resMsg) {
        this.setResMsg(resMsg);
        this.setSucceed(obj);
    }

    public void setSucceed(Object obj) {
        this.obj = obj;
        this.setRes(1000000);
    }

    public void setSucceedMsg(String resMsg) {
        this.setRes(1000000);
        this.setResMsg(resMsg);
    }

    public void setFailMsg(String resMsg) {
        this.obj = null;
        this.setRes(1000001);
        this.setResMsg(resMsg);
    }

    public String toString() {
        return "AjaxRes [res=" + this.res + ", resMsg=" + this.resMsg + ", obj=" + this.obj + "]";
    }
}
