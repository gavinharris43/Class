package com.qa.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.qa.persistence.repository.TraineeRepository;

public class AccountServiceImpl implements TraineeService {

	@Inject
	private TraineeRepository repo;


	@Override
	public String getAllTraineesFromClass(String classID) {
	
		return repo.getAllTraineesFromClass(classID);
	}

	@Override
	public String deleteTrainee(int ID) {

		return repo.deleteTrainee(ID);
	}

	@Override
	public String updateTrainee(int ID, String trainee) {
		
		return repo.updateTrainee(ID,trainee);
	}

	@Override
	public String createTrainee(String trainee) {

		return repo.createTrainee(trainee);

	}
	public void setRepo(TraineeRepository repo) {
		this.repo = repo;
	}

}
