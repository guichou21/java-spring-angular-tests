package com.gbcreation.app.demo.services;


import com.gbcreation.app.demo.entity.Place;

import java.util.Collection;

public interface  PlaceService {

    Collection<Place> getAllPlaces();

    Place getPlaceById(Long id);

    Place createPlace(Place place);

    Place updatePlace(Place place);

    void deletePlace(Long id);

    Place getPlaceByShortName(String shortName);
}

