package com.ds.project.clickit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project.clickit.Entity.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer> {

}
