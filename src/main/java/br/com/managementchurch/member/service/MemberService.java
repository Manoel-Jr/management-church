package br.com.managementchurch.member.service;

import br.com.managementchurch.member.model.dto.request.MemberRequest;
import br.com.managementchurch.member.model.dto.request.MemberUpdateRequest;
import br.com.managementchurch.member.model.dto.response.MemberResponse;

import java.util.List;

public interface MemberService {

    public MemberResponse create(MemberRequest request);

    public MemberResponse getMemberById(Long id);

    public List<MemberResponse> getAll();

    public MemberResponse update(MemberUpdateRequest request, Long id);

    public void delete(Long id);
}
