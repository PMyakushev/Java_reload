package com.example_2;

import java.util.List;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Students {
    private String surName;
    private Integer groupNumber;
    private Integer scholarshipAmount;
    private List<Integer> count;

    public Object setCount() {
        return null;
    }
}
