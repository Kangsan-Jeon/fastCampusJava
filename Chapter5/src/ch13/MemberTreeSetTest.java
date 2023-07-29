package Chapter5.src.ch13;


import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o1.compareTo(o2))*(-1); // 내림차순
    }
}

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();

        Member memberHong = new Member(1004, "홍길동");
        memberTreeSet.addMember(memberHong);

        memberTreeSet.showAllMember();

        TreeSet<String> set = new TreeSet<>(new MyCompare());
        set.add("홍길동");
        set.add("강감찬");
        set.add("김유신");

        System.out.println(set);

    }
}
