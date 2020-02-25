package com.xebia.seatallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.seatallocation.model.SeatsMapped;

@Repository
public interface SeatAllocationRepository extends JpaRepository<SeatsMapped, Long> {

}
