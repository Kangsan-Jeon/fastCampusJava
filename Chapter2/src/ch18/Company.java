package Chapter2.src.ch18;

public class Company {
    /*
    싱글톤 패턴은 인스턴스가 하나만 존재할 때 사용
     */

    private static Company instance = new Company();    // 유일한 객체
    private Company() {}

    // 싱글톤 패턴
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
