package br.com.managementchurch.member.service.impl;

import br.com.managementchurch.member.model.dto.request.MemberRequest;
import br.com.managementchurch.member.model.dto.request.MemberUpdateRequest;
import br.com.managementchurch.member.model.dto.response.MemberResponse;
import br.com.managementchurch.member.model.entity.Member;
import br.com.managementchurch.member.repositories.MemberRepository;
import br.com.managementchurch.member.service.MemberService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

    private final ModelMapper modelMapper;

    @Override
    public MemberResponse create(MemberRequest request) {
        if (!repository.existsByCpfAndWhatsApp(request.getCpf(),request.getWhatsApp())){
            Member member = modelMapper.map(request,Member.class);
            return  modelMapper.map(repository.save(member),MemberResponse.class);
        }
        throw new RuntimeException();
    }

    @Override
    public MemberResponse getMemberById(Long id) {
        Member member = repository.findById(id).orElseThrow(RuntimeException::new);
        return modelMapper.map(member,MemberResponse.class);
    }

    @Override
    public List<MemberResponse> getAll() {
        List<Member> memberResponseList = repository.findAll();
        return memberResponseList.stream().map(
                member -> modelMapper.map(member,MemberResponse.class))
                .collect(Collectors.toList());
    }


    public MemberResponse update(MemberUpdateRequest request, Long id) {
        request.setId(id);
        Member member = modelMapper.map(request,Member.class);
        return modelMapper.map(repository.save(member),MemberResponse.class);
    }


    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
