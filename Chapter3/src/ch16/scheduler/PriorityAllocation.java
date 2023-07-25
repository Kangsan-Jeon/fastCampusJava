package Chapter3.src.ch16.scheduler;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고개을 먼저 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무능력 우수한 상담원에게 배분합니다.");
    }
}
