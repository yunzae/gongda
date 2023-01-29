package projectbusan.gongda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectbusan.gongda.domain.Group;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    Group save(Group member);
    Optional<Group> findById(Long id);
    List<Group> findAll();
    Optional<Group> findByCode(String name);
    void deleteById(Long id);


}
