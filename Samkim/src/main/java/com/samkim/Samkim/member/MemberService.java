package com.samkim.Samkim.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public Member createMember(Member member) {
        Member creatMember = member;
        return creatMember;
    }
    public Member updateMember(Member member) {
        Member updateMember = member;
        return updateMember;
    }
    public Member findMember(long memberId) {
        Member findMember = new Member(memberId, "김경아", "010-1234-5678", "kyunga@gmail.com", 170);
        return findMember;
    }
    public void deleteMember(long memberId) {
    }
}
