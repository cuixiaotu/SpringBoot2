package com.xiaotu.boot2.bean;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class Pet implements Serializable {
    private String name;
    private Double weight;
}
