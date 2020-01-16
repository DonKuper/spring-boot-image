package ru.kuper.springbootimage.repo;

import org.springframework.data.repository.CrudRepository;
import ru.kuper.springbootimage.model.ImageObj;

public interface ImageRepository extends CrudRepository<ImageObj, Long> {

}
