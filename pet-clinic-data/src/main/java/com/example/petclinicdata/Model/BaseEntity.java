package com.example.petclinicdata.Model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

     private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
