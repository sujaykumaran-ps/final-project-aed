/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class MemberDirectory {
    
    private ArrayList<Member> memberList;
    private Member member;
    
    public MemberDirectory(){
        this.memberList=new ArrayList<Member>();
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public Member createMember(String username){
        member = new Member(username);
        memberList.add(member);
        return member;
    }
    
    public void deleteMember(String username){
        for(int i=0;i<memberList.size();i++){
            if(memberList.get(i).getMemUsername().equals(username)){
                memberList.remove(i);
            }
        }
    }
    
    
}
