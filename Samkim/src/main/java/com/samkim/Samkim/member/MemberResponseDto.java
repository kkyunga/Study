package com.samkim.Samkim.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponseDto {
    private long memberId;
    private String name;
    private String phone;
    private String email;
    private int height;
}
