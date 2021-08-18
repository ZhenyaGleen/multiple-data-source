package com.example.multipledatasource.repository.member;


import com.example.multipledatasource.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}