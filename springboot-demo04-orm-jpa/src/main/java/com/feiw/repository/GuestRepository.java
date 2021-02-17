package com.feiw.repository;

import com.feiw.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pizisummer
 */
public interface GuestRepository extends JpaRepository<Guest,Long> {
}
