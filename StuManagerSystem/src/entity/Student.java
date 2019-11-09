package entity;

/**
 * @author ZhangHao
 * @date 2019/10/25 21:19
 * @Description： 学生类
 */
public class Student {

/**
 * @author Zhanghao
 * @date 2019/10/25 21:21
 * @Description: 设立的标准是学生类应该有的属性,而不是数据库有什么就设什么.
 */
    private int id;
    private String name;
    private String age;
    private String gender;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
