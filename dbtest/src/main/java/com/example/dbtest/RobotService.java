package com.example.dbtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RobotService {
	
	@Autowired
	RobotRepository robotRepository;
	
	@Autowired
	RobotModelRepository robotModelRepository;
	
	
//	@Transactional
	public void save(Robot robot) {
		robotRepository.save(robot);
	}
	
	public List<Robot> find(Robot robot) {
		return robotRepository.findAll();
	}
	
	public List<Robot> findByRobotSerial(Robot robot) {
		return robotRepository.findByRobotSerial(robot.getRobotSerial());
	}
	
	public void savejoin(RobotModel robotModel) {
		robotModelRepository.save(robotModel);	
	}
	
	public void findjoin() {
		
	}
	
	

}
