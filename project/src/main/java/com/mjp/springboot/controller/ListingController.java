package com.mjp.springboot.controller;

import com.mjp.springboot.entity.Listing;
import com.mjp.springboot.service.ListingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/listings")
public class ListingController {

    private ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @GetMapping("/searchListings")
    public ResponseEntity<List<Listing>> searchListings(@RequestParam("query") String query){
        return ResponseEntity.ok(listingService.searchListings(query));
    }

    @PostMapping("/postListing")
    public Listing createListing(@RequestBody Listing listing){
        return listingService.createListing(listing);
    }
}
