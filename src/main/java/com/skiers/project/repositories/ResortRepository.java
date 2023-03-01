package com.skiers.project.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.skiers.project.models.LiftRide;

public interface ResortRepository extends MongoRepository<LiftRide, String> {
        @Query(value = "{ 'resortID': ?0 }")
        LiftRide findByMappingCode(String resortID);
        


        

        
        

}









