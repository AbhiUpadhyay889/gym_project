package com.gymapp2.services;

import java.util.List;

import com.gymapp2.model.Member;

public interface IMemberService {

	List<Member> getAllMember();

	Member getMemberById(Integer memberId);

	void deleteMember(Integer memberId);

	void saveOrUpdateMember(Member member);

	 void updateMember(Member member, Integer memberId);

	List<Member> getMemberByName(String name);

	List<Member> getMemberByAge(Integer minAge, Integer maxAge);
	

}
