package com.duvanlabrador.Pizzas.domain.model;

/**
 * Esta clase es un POJO con info la cual se deja lo mas puro posible, ya que
 * no se deben usar librerias externas o referencias al framework en el domain.
 **/

public class Student {

    private Long studentId;
    private String name;
    private String lastname;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(Long studentId, String name, String lastname, Integer age, String address) {
        this.studentId = studentId;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}







