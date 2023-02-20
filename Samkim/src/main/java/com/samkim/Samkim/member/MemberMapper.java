package com.samkim.Samkim.member;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDto (MemberPostDto memberPostDto);
    Member memberPatchDto (MemberPatchDto memberPatchDto);
    MemberResponseDto memberResponseDto (Member member);
}
