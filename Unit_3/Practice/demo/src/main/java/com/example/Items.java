package com.example;

import lombok.*;

/**
 * Items
 */
@Data
@AllArgsConstructor

public class Items {
    public Items() {
    }

    private String name;
    private String country;
    private Integer volume;

}