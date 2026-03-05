package com.example.learningSpringBoot.Repository;

import com.example.learningSpringBoot.Entity.Sport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SportRepository {
    Map<Integer, Sport> sportMap = new HashMap<>();

    public Sport save(Sport sport) {
        sportMap.put(sport.getId(), sport);
        return sport;
    }

    public List<Sport> findAll() {
        return new ArrayList<>(sportMap.values());
    }

    public Sport findById(int id) {
        return sportMap.get(id);
    }

    public Sport update(Sport sport) {
        sportMap.put(sport.getId(), sport);
        return sport;
    }

    public void delete(int id) {
        sportMap.remove(id);
    }

}
