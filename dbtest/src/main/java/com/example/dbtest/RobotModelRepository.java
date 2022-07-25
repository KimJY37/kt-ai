package com.example.dbtest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotModelRepository  extends JpaRepository<RobotModel, Integer>{

}
