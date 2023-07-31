package Chapter6.src.ch17;


import java.io.*;

class Person implements Serializable {
    String name;
    transient String job;   // 직렬화 할 수 없는 변수는 transient를 이용하여 직렬화 하지 않음

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person personLee = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee);
            oos.writeObject(personKim);
        }catch (IOException e) {
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);
        }catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e2) {
            System.out.println(e2);
        }

    }
}
