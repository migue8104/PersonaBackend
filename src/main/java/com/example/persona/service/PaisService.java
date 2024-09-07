package com.example.persona.service;

import com.example.persona.model.Pais;
import com.example.persona.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PaisService implements PaisRepository {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Pais> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pais getOne(Long aLong) {
        return null;
    }

    @Override
    public Pais getById(Long aLong) {
        return null;
    }

    @Override
    public Pais getReferenceById(Long aLong) {
        return null;
    }



    @Override
    public List findAll(Example example, Sort sort) {
        return List.of();
    }

    @Override
    public List findAll(Example example) {
        return paisRepository.findAll();
    }

    @Override
    public List saveAllAndFlush(Iterable entities) {
        return List.of();
    }


    @Override
    public List saveAll(Iterable entities) {
        return List.of();
    }



    @Override
    public <S extends Pais> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Pais> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public List findAllById(Iterable iterable) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Pais entity) {

    }


    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional findOne(Example example) {
        return Optional.empty();
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        return null;
    }

    @Override
    public long count(Example example) {
        return 0;
    }

    @Override
    public boolean exists(Example example) {
        return false;
    }

    @Override
    public Object findBy(Example example, Function queryFunction) {
        return null;
    }
}
