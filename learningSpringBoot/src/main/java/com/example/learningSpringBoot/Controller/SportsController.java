package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Entity.Sport;
import com.example.learningSpringBoot.Service.SportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports")
public class SportsController {
    private final SportService sportService;

    public SportsController(SportService sportService) {
        this.sportService = sportService;
    }

    @PostMapping
    public Sport addSport(@RequestBody Sport sport) {
        System.out.println(sport);
        return sportService.addSport(sport);
    }

    @GetMapping
    public List<Sport> getAllSports() {
        return sportService.getAllSports();
    }

    @GetMapping("/{id}")
    public Sport getSportId(@PathVariable int id) {
        return sportService.getSportId(id);
    }

    @PutMapping
    public Sport updateSport(@RequestBody Sport sport) {
        return sportService.updateSport(sport);
    }

    @DeleteMapping("/{id}")
    public String deleteSport(@PathVariable int id) {
        sportService.deleteSport(id);
        return "Sport deleted successfully";
    }

}
