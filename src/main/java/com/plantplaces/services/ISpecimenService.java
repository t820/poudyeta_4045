package com.plantplaces.services;

import com.plantplaces.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchById(int id);

	void save(SpecimenDTO specimenDTO);

}