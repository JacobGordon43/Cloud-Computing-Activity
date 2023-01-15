/**
 * 
 */
package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginModel {
//Define variable
    @NotNull(message ="Username is a required field")
    @Size(min = 1, max = 32, message = "Username must be between 1 and 32")
    private String username;
    @NotNull(message ="Password is a required field")
    @Size(min = 1, max = 32, message = "Username must be between 1 and 32")
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
