package am.developer.repository;

import am.developer.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by by hayk on 03/07/2018
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
