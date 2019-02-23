package com.robin.springbootDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by qukoucai001 on 2019/2/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private Long id;
    private Double price;
    private String desc;
}
