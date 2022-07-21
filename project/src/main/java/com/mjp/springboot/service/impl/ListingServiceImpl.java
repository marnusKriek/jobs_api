package com.mjp.springboot.service.impl;

import com.mjp.springboot.entity.Listing;
import com.mjp.springboot.repository.ListingRepository;
import com.mjp.springboot.service.ListingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingServiceImpl implements ListingService {

    private ListingRepository listingRepository;

    public ListingServiceImpl(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    @Override
    public List<Listing> searchListings(String query) {
       List<Listing> listings = listingRepository.searchListings(query);
       return listings;
    }

    @Override
    public Listing createListing(Listing listing) {
        return listingRepository.save(listing);
    }

}
