package Chapter2.src.ch10;

public class Birthday {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if ((month < 1) || (month > 12)) {
            this.isValid = false;
        }
        else {
            this.month = month;
            this.isValid = true;

        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year+"년 "+month+"월 "+day+"일 입니다.");
        }
        else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
