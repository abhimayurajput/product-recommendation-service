package com.neosoft.ProductrecommendationService.repository;

import com.neosoft.ProductrecommendationService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
