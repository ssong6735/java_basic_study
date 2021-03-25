package day09.encap;

public class Person {

    private String name;
    private int age;
    private boolean phone; // 핸드폰 유무

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

    public boolean isPhone() { // boolean 타입인경우 getter 대신 is + 필드명으로 지정한다.
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }
}
