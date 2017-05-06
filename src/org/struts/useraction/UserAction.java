package org.struts.useraction;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 18610 on 2017/5/6.
 */
public class UserAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() {
        System.out.println("Login.action");
        if ("1111".equals(username) && "1111".equals(password)) {
            return "success";
        } else {
            return "error";
        }
    }
}
