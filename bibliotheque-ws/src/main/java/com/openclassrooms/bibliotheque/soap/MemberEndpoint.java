package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.projects.bibliot.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static com.openclassrooms.projects.bibliot.Status.NOT_FOUND;
import static com.openclassrooms.projects.bibliot.Status.SUCCESS;

public class MemberEndpoint {

    private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private MemberService memberService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMemberByNameAndFirstNameRequest")
    @ResponsePayload
    public GetMemberByNameAndFirstNameResponse getMemberByNameAndFirstName(@RequestPayload GetMemberByNameAndFirstNameRequest request) {
        GetMemberByNameAndFirstNameResponse response = new GetMemberByNameAndFirstNameResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Member member = memberService.findByNameAndFirstName(request.getName(), request.getFirstName());
        if (member == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            MemberWs memberWs = new MemberWs();
            BeanUtils.copyProperties(member, memberWs);
            response.setMemberWs(memberWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createMemberRequest")
    @ResponsePayload
    public CreateMemberResponse createMember(@RequestPayload CreateMemberRequest request) {
        CreateMemberResponse createMemberResponse = new CreateMemberResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Member member = new Member();
        BeanUtils.copyProperties(request.getMemberWs(), member);
        Member memberCreated = memberService.create(request.getMemberWs());
        if (memberCreated == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            MemberWs memberWs = new MemberWs();
            BeanUtils.copyProperties(memberCreated, memberWs);
            createMemberResponse.setMemberWs(memberWs);
        }
        createMemberResponse.setServiceStatus(serviceStatus);
        return createMemberResponse;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDeleteMemberRequest")
    @ResponsePayload
    public GetDeleteMemberResponse getDeleteMember(@RequestPayload GetDeleteMemberRequest request) {
        GetDeleteMemberResponse response = new GetDeleteMemberResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Member memberToDelete = memberService.deleteMember(request.getId());
        if (memberToDelete == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            MemberWs memberWs = new MemberWs();
            BeanUtils.copyProperties(memberToDelete, memberWs);
            response.setMemberWs(memberWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

}
