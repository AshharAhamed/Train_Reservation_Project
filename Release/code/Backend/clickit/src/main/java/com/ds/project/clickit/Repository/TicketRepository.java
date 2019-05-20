package com.ds.project.clickit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project.clickit.Entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
