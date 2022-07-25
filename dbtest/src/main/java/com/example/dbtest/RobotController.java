package com.example.dbtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class RobotController {
	
	@Autowired
	RobotRepository robotRepository;
	
	@Autowired
	RobotModelRepository robotModelRepository;
	
	@PostMapping(path="/robot")
	public void save(@RequestBody Robot robot) {
		robotRepository.save(robot);
	}
	
	@PostMapping(path="/robotjoin")
	public void savejoin(@RequestBody RobotModel robotModel) {
		robotModelRepository.save(robotModel);
	}
	
//	@GetMapping("/find")
//	public List<Robot> find(){
//		List<Robot> resultlist = robotRepository.findAll();
//		System.out.println(resultlist);
////		List<RobotModel> resultlist2 = new ArrayList<RobotModel>();
////		for (Robot robot : resultlist) {
////			System.out.println(robot.getRobotmodel());
////			resultlist2.add(robot.getRobotmodel());
////		}
//		return robotRepository.findAll();
//	}
	
	@GetMapping("/find")
	public void find(){
//		List<Robot> resultlist = robotRepository.findAll();
//		System.out.println(resultlist.get(0).getRobotSerial());
		Robot robot = robotRepository.findById(1).get();
		System.out.println(robot.getRobotmodel());
	}`9
	
}
