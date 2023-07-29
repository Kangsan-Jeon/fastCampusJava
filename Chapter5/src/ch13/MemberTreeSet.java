package Chapter5.src.ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
//        treeSet = new TreeSet<>();  // comparable
        treeSet = new TreeSet<>(new Member());  // comparator
    }
    public MemberTreeSet(int size) {
        treeSet = new TreeSet<>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAllMember() {
        for(Member member:treeSet) {
            System.out.println(member);
        }
    }
}
