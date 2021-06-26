package com.blockchain.blockchain_manage.manger;

import com.blockchain.blockchain_manage.Repository.MemberRepository;
import com.blockchain.blockchain_manage.bean.Member;
import com.blockchain.blockchain_manage.bean.memberData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class memberManger {
    @Autowired
    MemberRepository memberRepository;

    public String findGroupId(String name){
        Member member = memberRepository.findFirstByName(name);
        return member.getGroupId();
    }

    public memberData memberData(String name,String appId,String ip){
        memberData memberData = new memberData();
        Member member = memberRepository.findFirstByAppId(appId);

        if(member == null){
            memberData.setCode("-1");
            memberData.setMsg("找不到此成员");
        }
        else if (!member.getName().equals(name)){
            memberData.setCode("-2");
            memberData.setMsg("成员名不匹配");
        }
        else if(!member.getIp().equals(ip)){
            memberData.setCode("-3");
            memberData.setMsg("成员ip不匹配");
        }
        else{
            memberData.setCode("0");
            List<Member> list = memberRepository.findByGroupId(findGroupId(name));
            memberData.setMembers(list);
            return memberData;
        }
        return null;
    }

}
