package Chapter6.src.ch10;

public class PassWordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PassWordException {

        if (password == null) {
            throw new PassWordException("비밀번호를 입렵해주세요");
        }
        else if(password.length() < 5) {
            throw new PassWordException("비밀번호는 5자 이상이어야 합니다");
        }
        else if(password.matches("[a-zA-Z]+")) {
            throw new PassWordException("비밀번호는 숫자나 특수문자를 표함해야합니다.");
        }

        this.password = password;
    }

    public static void main(String[] args) {
        PassWordTest test = new PassWordTest();

        String password = null;
        try {
            test.setPassword(password);
        } catch (PassWordException e) {
            System.out.println(e);
        }

        password = "abd";
        try {
            test.setPassword(password);
        } catch (PassWordException e) {
            System.out.println(e);
        }

        password = "abecde";
        try {
            test.setPassword(password);
        } catch (PassWordException e) {
            System.out.println(e);
        }

        password = "asda3213";
        try {
            test.setPassword(password);
            System.out.println("오류없음");
        } catch (PassWordException e) {
            System.out.println(e);
        }
    }
}
