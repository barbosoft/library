package com.example.library.repositories;

import com.example.library.models.Acces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesRepository extends CrudRepository<Acces, Long> {

}
