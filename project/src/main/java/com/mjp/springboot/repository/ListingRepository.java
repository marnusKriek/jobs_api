package com.mjp.springboot.repository;

import com.mjp.springboot.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListingRepository extends JpaRepository<Listing, Long> {

    @Query("SELECT o FROM Listing o WHERE o.title LIKE CONCAT('%', :query, '%' ) OR o.description LIKE CONCAT('%', :query, '%' )")
    List<Listing> searchListings(String query);



}
