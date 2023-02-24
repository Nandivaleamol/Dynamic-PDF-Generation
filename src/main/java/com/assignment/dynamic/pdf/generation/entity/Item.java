package com.assignment.dynamic.pdf.generation.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String quantity;
    private BigDecimal rate;
    private BigDecimal amount;
}
