package dung.Webbansach_backend.dao;

import dung.Webbansach_backend.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="rating")
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}