package com.suhas.kafka.consumerexamplespringboot.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserData implements Serializable {
    private String customerName;
    private double amountDeposited;
    private double goldInGrams;
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        return "UserData{" +
                "customerName='" + customerName + '\'' +
                ", amountDeposited=" + amountDeposited +
                ", goldInGrams=" + goldInGrams +
                '}';
    }

}
