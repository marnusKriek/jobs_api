package com.mjp.springboot.service;

import com.mjp.springboot.entity.Listing;

import java.util.List;

public interface ListingService {

    List<Listing> searchListings(String query);

    Listing createListing(Listing listing);

}
