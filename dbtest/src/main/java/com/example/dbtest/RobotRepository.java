package com.example.dbtest;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotRepository extends JpaRepository<Robot, Integer>{
	List<Robot> findByRobotSerial(String robotSerial);
}
