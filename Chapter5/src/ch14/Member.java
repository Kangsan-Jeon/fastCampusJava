package Chapter5.src.ch14;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member() {}

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.getMemberId()) {
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }
    
    
/*
    // comparable로 구현한 경우
    @Override
    public int compareTo(Member member) {
        // 추가하려는 것이 크면 양수, 작으면 음수, 같으면 0을 반환
        // 내림차순은 양수, 음수 반대로
        return (this.memberId - member.memberId)*(-1);
    }
*/

    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }
}
