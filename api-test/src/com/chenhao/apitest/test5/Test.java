package com.chenhao.apitest.test5;


import java.math.BigDecimal;

/*
有以下学员信息：
		张三,男,20,79.5
		李四,女,21,80.2
		王五,男,22,77.9
		周六,男,20,55.8
		赵七,女,21,99.9
	请定义学员类，属性：姓名、性别、年龄、分数
	请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三","男",20,79.5);
        Student stu2 = new Student("李四","女",21,80.2);
        Student stu3 = new Student("王五","男",22,77.9);
        Student stu4 = new Student("周六","男",20,55.8);
        Student stu5 = new Student("赵七","女",21,99.9);
        //将分数转换成BigDecimal 类型并累加
        BigDecimal stu1Score  = new BigDecimal(stu1.getScore().toString());
        BigDecimal stu2Score  = new BigDecimal(stu2.getScore().toString());
        BigDecimal stu3Score  = new BigDecimal(stu3.getScore().toString());
        BigDecimal stu4Score  = new BigDecimal(stu4.getScore().toString());
        BigDecimal stu5Score  = new BigDecimal(stu5.getScore().toString());
        //累加
        BigDecimal total = stu1Score.add(stu2Score).add(stu3Score).add(stu4Score).add(stu5Score);

        //求平均值
        BigDecimal ave = total.divide((new BigDecimal((5+""))),2,BigDecimal.ROUND_HALF_UP);
        System.out.println("平均值为"+ave);

    }
}

class Student{
    private String name;
    private String gender;
    private Integer age;
    private Double score;

    public Student() {
    }

    public Student(String name, String gender, Integer age, Double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        if (age != null ? !age.equals(student.age) : student.age != null) return false;
        return score != null ? score.equals(student.score) : student.score == null;
    }

}
