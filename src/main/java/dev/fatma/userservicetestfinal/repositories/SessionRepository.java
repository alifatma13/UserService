package dev.fatma.userservicetestfinal.repositories;

import dev.fatma.userservicetestfinal.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    Optional<Session> findByTokenAndUser_Id(String token, Long userId);
    //select * from sessions where token = <> and userId = <>
}
