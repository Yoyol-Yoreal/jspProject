package org.struts.useraction;

import com.opensymphony.xwork2.ActionSupport;
import dao.Dao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yoreal on 2017/5/6.
 */
public class LoginAction extends ActionSupport {
    private Dao dao = new Dao();
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

    public String login() {
        System.out.println("Login.action");
        HttpServletRequest request = ServletActionContext.getRequest();
        String sql = "select * from user where username='" + getUsername() + "' and password ='" + getPassword() + "'";
        ResultSet rs = dao.executeQuery(sql);
        try {
            if (rs.next()) {
                request.getSession().setAttribute("owner", getUsername());
                return "success";
            }
            return "error";
        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
