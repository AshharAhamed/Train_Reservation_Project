package com.ds.project.clickit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project.clickit.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
