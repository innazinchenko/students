package ait.cohort55.student.dao;

import ait.cohort55.student.model.Student;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;


public interface StudentRepository extends CrudRepository<Student, Long> {
    Stream<Student> findByNameIgnoreCase(String name);

    Long countByNameInIgnoreCase(Set<String> names);
}
