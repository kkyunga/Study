package com.samkim.Samkim.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/k1/members")
@Validated
public class MemberController {
    private MemberMapper mapper;
    private MemberService service;

    public MemberController(MemberMapper mapper, MemberService service) {
        this.mapper = mapper;
        this.service = service;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberPostDto) {
        Member member = mapper.memberPostDto(memberPostDto);
        Member response = service.createMember(member);
        return new ResponseEntity<>(mapper.memberResponseDto(response), HttpStatus.CREATED);
    }
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Positive long memberId,
                                      @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        Member response = service.updateMember(mapper.memberPatchDto(memberPatchDto));
        return new ResponseEntity<>(mapper.memberResponseDto(response), HttpStatus.OK);
    }
    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") @Positive long memberId) {
        Member response = service.findMember(memberId);
        return new ResponseEntity<>(mapper.memberResponseDto(response), HttpStatus.OK);
    }
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") @Positive long memberId) {
        service.deleteMember(memberId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
