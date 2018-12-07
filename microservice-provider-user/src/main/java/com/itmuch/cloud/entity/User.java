package com.itmuch.cloud.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.ws.rs.GET;
import java.math.BigDecimal;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Setter@Getter
    private long id;
    @Column
    @Setter@Getter
    private String username;
    @Column
    @Setter@Getter
    private String name;
    @Column
    @Setter@Getter
    private short age;
    @Column
    @Setter@Getter
    private BigDecimal balance;

}
