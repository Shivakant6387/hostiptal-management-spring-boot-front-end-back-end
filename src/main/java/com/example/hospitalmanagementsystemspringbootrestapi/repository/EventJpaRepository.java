package com.example.hospitalmanagementsystemspringbootrestapi.repository;
import java.time.LocalDateTime;
import java.util.List;
import com.example.hospitalmanagementsystemspringbootrestapi.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EventJpaRepository extends JpaRepository<Event, Long> {

    /* Note these two methods do the same thing.  The @Repository annotation handles both*/


    /* This one uses a JPQL */
    public List<Event> findByStartGreaterThanEqualAndFinishLessThanEqual(LocalDateTime start, LocalDateTime end);

    public List<Event> findByName(String name);

    public List<Event> findByStart(LocalDateTime start);

    /* This one uses an @Query */
    @Query("select b from Event b where b.start >= ?1 and b.finish <= ?2")
    public List<Event> findByDateBetween(LocalDateTime start, LocalDateTime end);
}
