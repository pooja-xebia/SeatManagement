package com.xebia.seatmanagementmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.seatmanagementmaster.model.ProjectRoomMaster;

@Repository
public interface ProjectRoomMasterRepository extends JpaRepository<ProjectRoomMaster, Long> {

}
