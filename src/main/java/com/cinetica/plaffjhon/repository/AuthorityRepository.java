package com.cinetica.plaffjhon.repository;

import com.cinetica.plaffjhon.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
