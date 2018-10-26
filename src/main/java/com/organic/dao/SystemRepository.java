package com.organic.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.organic.model.SystemExample;

@Repository
public interface SystemRepository extends CrudRepository<SystemExample,Long> {
	

}
