package org.sid.cinema.dao;

import org.sid.cinema.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place,Long> {
    

}
