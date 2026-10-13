package com.aaiimm.kk.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aaiimm.kk.ent.OrderDetails;

public interface OrderRepo extends JpaRepository<OrderDetails, Integer> {
}