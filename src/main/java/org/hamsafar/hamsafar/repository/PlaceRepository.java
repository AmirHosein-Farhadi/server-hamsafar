package org.hamsafar.hamsafar.repository;

import org.hamsafar.hamsafar.model.Place;
import org.hamsafar.hamsafar.model.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {
    Optional<Place> findByIdAndVerifiedTrue(String id);

    List<Place> findAllByTagIsIn(List<Tag> tags);

    List<Place> findAllByVerifiedTrue();

    Page<Place> findAllByVerified(Boolean isVerified, Pageable pageable);

    Page<Place> findAllByVerifiedOrderByRate(Boolean isVerified, Pageable pageable);

    Page<Place> findAllByVerifiedAndAdmin_Id(Boolean isVerified, String adminId, Pageable pageable);

    List<Place> findAllByVerifiedTrueAndTag_Id(String tagId);
}
