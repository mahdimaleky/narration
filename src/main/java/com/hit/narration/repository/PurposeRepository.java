package com.hit.narration.repository;

import com.hit.narration.domain.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface PurposeRepository extends JpaRepository<Purpose, Long> {
}
