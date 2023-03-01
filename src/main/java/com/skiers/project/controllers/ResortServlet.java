package com.skiers.project.controllers;
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.List;

//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.google.gson.Gson;

import com.skiers.project.models.LiftRide;

import com.skiers.project.repositories.ResortRepository;


// @WebServlet("/resorts/")
// public class ResortServlet extends HttpServlet {
//     @Autowired
//     ResortRepository resortRepository;
//     private Gson gson = new Gson();
    
//     @Override
//     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         List<Resorts> listtotal = new ArrayList<>();
//         listtotal = resortRepository.findAll();         
//         String jsonString = gson.toJson(listtotal); //
//         PrintWriter out = resp.getWriter();
//         //resp.setContentType("application/json");
//         //resp.setCharacterEncoding("UTF-8");
//         out.print(jsonString);
//         out.flush();
//     }
// }

@RestController
public class ResortServlet {

    @Autowired
    ResortRepository resortRepository;


@PostMapping("/skiers/{resortID}/seasons/{seasonID}/days/{dayID}/skiers/{skierID}")
public ResponseEntity<LiftRide>  Resortupdater(@PathVariable(value = "resortID") Integer resortID,@PathVariable(value = "seasonID") String seasonID,@PathVariable(value = "dayID") String dayID,@PathVariable(value = "skierID") Integer skierID,
  @Valid @RequestBody LiftRide ResortDetails){


    //Resorts resorts = resortRepository.findByMappingCode(resortID);
    LiftRide resorts=new LiftRide();
  


    resorts.setTime(ResortDetails.getTime());
    resorts.setLiftID(ResortDetails.getLiftID());
    resorts.setResortID(resortID);
    resorts.setSeasonID(seasonID);
    resorts.setDayID(dayID);
    resorts.setSkierID(skierID);
    final LiftRide Resortupdater = resortRepository.save(resorts);
    return ResponseEntity.ok(Resortupdater);
}
}






