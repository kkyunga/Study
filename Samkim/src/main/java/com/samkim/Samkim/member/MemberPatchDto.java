package com.samkim.Samkim.member;

import javax.validation.constraints.*;
import java.sql.PreparedStatement;

public class MemberPatchDto {
    private long memberId;
    private String name;
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$")
    private String phone;
    @Email
    private String email;
    @Min(50)
    @Max(249)
    @Pattern(regexp = "^\\d{2,3}$")
    private int height;

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
