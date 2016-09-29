package com.gbcreation.app.demo.repositories;


import com.gbcreation.app.demo.entity.Place;
import org.springframework.data.repository.CrudRepository;

public interface  PlaceRepository extends CrudRepository<Place, Long> {
    Place findByShortName(String shortName);
}
