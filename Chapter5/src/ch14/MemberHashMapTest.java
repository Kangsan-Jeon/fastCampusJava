package Chapter5.src.ch14;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAll();

        memberHashMap.removeMember(memberHong.getMemberId());
        memberHashMap.showAll();

    }
}
