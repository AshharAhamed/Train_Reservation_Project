package com.ds.project.clickit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project.clickit.Entity.Train;

public interface TrainRepository extends JpaRepository<Train,Integer> {

	List<Train> findByFromAndTo(String string, String string2);

}
