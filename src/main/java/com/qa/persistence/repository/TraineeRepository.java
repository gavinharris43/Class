package com.qa.persistence.repository;

import java.util.Map;


public interface TraineeRepository {

	String getAllTraineesFromClass(String classID);
	String deleteTrainee(int accountID);
	String updateTrainee(int accountID, String account);
	String createTrainee(String account);
}