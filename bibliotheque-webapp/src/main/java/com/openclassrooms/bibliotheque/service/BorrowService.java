package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.ws.BorrowWs;
import com.openclassrooms.bibliotheque.ws.MemberWs;

import java.util.List;

public interface BorrowService {

    BorrowWs borrowBook(Long workId, Long memberId);

    BorrowWs extendBorrow(Long borrowId);

    BorrowWs terminateBorrow(Long borrowId);

    List<BorrowWs> findBorrowListByMemberId(Long memberId);

    List<BorrowWs> findBorrowListByMember(MemberWs memberWs);


}
