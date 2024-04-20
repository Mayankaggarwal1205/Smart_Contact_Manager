package com.smartContactManager.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myOrderId;

    private String orderId;
    private String amount;
    private String receipt;
    private String status;
    private String paymentId;

    @ManyToOne
    private User user;

}
