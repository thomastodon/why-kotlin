package com.example.whykotlin.java.dataclasses;

import org.springframework.lang.NonNull;

import java.util.Objects;

public class BoilerplateUser {

    @NonNull private String name;
    @NonNull private Integer age;

    public BoilerplateUser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "BoilerplateUser{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoilerplateUser boilerplateUser = (BoilerplateUser) o;
        return Objects.equals(name, boilerplateUser.name) &&
            Objects.equals(age, boilerplateUser.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
