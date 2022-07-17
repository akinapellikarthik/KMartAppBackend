package com.kmart.demo.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {
    private String name;
    private Float price;
    private String description;
    private ProductType type;
}
