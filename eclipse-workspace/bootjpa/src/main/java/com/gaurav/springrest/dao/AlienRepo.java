package com.gaurav.springrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.gaurav.springrest.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

}
