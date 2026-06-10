package com.example.learningSpringBoot.Service;

import com.example.learningSpringBoot.Entity.Sport;
import com.example.learningSpringBoot.Repository.SportRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportService {
    private final SportRepository sportRepository;

    public SportService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    @PostConstruct
    public void sportDbInit() {
        System.out.println("Sport Init");
    }

    @PreDestroy
    public void sportClearCache() {
        System.out.println("Sport Clear Cache");
    }


    public Sport addSport(Sport sport) {
        return sportRepository.save(sport);
    }

    public List<Sport> getAllSports() {
        return sportRepository.findAll();
    }

    public Sport getSportId(int id) {
        return sportRepository.findById(id);
    }

    public Sport updateSport(Sport sport) {
        return sportRepository.update(sport);
    }

    public void deleteSport(int id) {
        sportRepository.delete(id);
    }

}
