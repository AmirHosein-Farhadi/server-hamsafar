package org.hamsafar.hamsafar.repository;

import org.hamsafar.hamsafar.model.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {
    List<Place> findAllByVerifiedTrue();

    Page<Place> findAllByVerified(Boolean isVerified, Pageable pageable);
}