package Chapter3.src.ch16.scheduler;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담수가 가장 적은 상담원에게 배분합니다.");
    }
}
