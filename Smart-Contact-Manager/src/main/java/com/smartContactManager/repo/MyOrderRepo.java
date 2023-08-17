package com.smartContactManager.repo;

import com.smartContactManager.entity.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyOrderRepo extends JpaRepository<MyOrder, Long> {

    public MyOrder findByOrderId(String orderId);

}
