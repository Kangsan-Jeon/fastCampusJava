package Chapter6.src.ch08;

import java.util.Arrays;
import java.util.stream.Stream;

public class TravelCustomer {
    private String name;
    private int age;
    private int cost;

    public TravelCustomer(String name, int age) {
        this.name = name;
        this.age = age;
        this.cost = age>15 ? 100:50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TravelCustomer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cost=" + cost +
                '}';
    }
}
