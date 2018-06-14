package com.example.whykotlin.java.dataclasses;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class LombokUser {

    @NonNull private String name;
    @NonNull private Integer age;
}
