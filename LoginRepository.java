package com.game.ThreeDay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.ThreeDay.Model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{

}
