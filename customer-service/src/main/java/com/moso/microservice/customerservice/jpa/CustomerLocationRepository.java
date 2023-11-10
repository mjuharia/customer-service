package com.moso.microservice.customerservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.microservice.customerservice.enity.CustomerLocation;

public interface CustomerLocationRepository extends JpaRepository<CustomerLocation, Integer> {

}
