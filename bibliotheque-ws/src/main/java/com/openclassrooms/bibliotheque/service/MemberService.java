package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.projects.bibliotheque.MemberWs;

import java.util.List;

public interface MemberService {



    Member findByNameAndFirstName(String name, String firstName);

    Member create(MemberWs member);

    List<Borrow> findBorrowListByMember (Member member);

    Member deleteMember(Long memberId);

}
