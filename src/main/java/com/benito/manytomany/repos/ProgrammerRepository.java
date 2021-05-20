package com.benito.manytomany.repos;

import org.springframework.data.repository.CrudRepository;

import com.benito.manytomany.entities.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
