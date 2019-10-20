package com.sa.saproject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    Long Id;

    String userName;
    String adress;
    String password;
}
