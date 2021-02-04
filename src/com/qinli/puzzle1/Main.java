package com.qinli.puzzle1;


/**
 * @Author Cambria
 * @creat 2021/2/3 23:29
 */
public class Main {
    static Student[] students = new Student[3];

    public static void main(String[] args) {

        Student stu0 = new Student("法外狂徒张三", 20);
        Student stu1 = new Student("李四", 21);
        Student stu2 = new Student("王五", 19);

        students[0] = stu0;
        students[1] = stu1;
        students[2] = stu2;

        printStu();

        return;
    }

    static void printStu(){
        for (Student student : students) {
            System.out.println("姓名：" + student.name);
            System.out.println("年龄：" + student.age);
        }
    }
}
