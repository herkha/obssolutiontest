package com.herkha.obssolutiontest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Order {
    @Id
    private String OrderId;
    private Long ItemId;
    private Long Qty;
}
