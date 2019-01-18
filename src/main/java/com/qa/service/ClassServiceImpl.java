package com.qa.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.qa.persistence.repository.ClassRepository;

public class ClassServiceImpl implements ClassService {

	@Inject
	private ClassRepository repo;
	

	@Override
	public String getAllClasses() {
		return repo.getAllClasses();
	}

	@Override
	public String deleteClass(int ID) {
		return repo.deleteClass(ID);
	}

	@Override
	public String updateClass(int ID, String clas) {
		return repo.updateClass(ID, clas);
	}

	@Override
	public String createClass(String clas) {
		return repo.createClass(clas);
	}
	public void setRepo(ClassRepository repo) {
		this.repo = repo;
	}
}
