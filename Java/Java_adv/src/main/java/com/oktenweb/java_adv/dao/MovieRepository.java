package com.oktenweb.java_adv.dao;

import com.oktenweb.java_adv.entity.Director;
import com.oktenweb.java_adv.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("Select m from Movie m where m.title like :title")
    Movie findByTitle (String title);


}
