package com.qa.service;

import java.util.Map;

public interface TraineeService  {

	String getAllTraineesFromClass(String classID);

	String deleteTrainee(int ID);

	String updateTrainee(int ID, String trainee);

	String createTrainee(String trainee);
	


}
