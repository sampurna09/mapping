package com.mapping;

import com.mapping.controller.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentReposioty extends JpaRepository<Parent,Integer> {
}
