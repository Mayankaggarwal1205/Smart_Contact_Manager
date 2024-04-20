package com.smartContactManager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String name;
    private String nickname;
    private String work;

    @Column(length = 1000)
    private String description;

    private String email;
    private String image;
    private String phone;

    @ManyToOne()
    @JsonIgnore
    private User user;

    @Override
    public boolean equals(Object obj) {
        return this.cId == ((Contact)obj).getCId();
    }
}
