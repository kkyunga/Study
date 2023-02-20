package com.samkim.Samkim.member;

import javax.validation.constraints.*;

public class MemberPostDto {
    @NotBlank
    private String name;
    @NotBlank
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$")
    private String phone;
    @NotBlank
    @Email
    private String email;
    @Min(50)
    @Max(249)
    @Pattern(regexp = "^\\d{2,3}$")
    private String height;

    public String getHeight() {
        return height;
    }

    public String getPhone() {
        return phone;
    }

    public void setHeight(String height) {
        this.height = height;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
