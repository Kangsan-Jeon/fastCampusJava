package Chapter5.src.ch12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }
    public MemberHashSet(int size) {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAllMember() {
        for(Member member:hashSet) {
            System.out.println(member);
        }
    }
}
