package com.example.persona.service;


import com.example.persona.model.Estado;
import com.example.persona.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EstadoService implements EstadoRepository{

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public void flush() {

    }

    public List<Estado> findAllByCountry(Long id){
        List<Estado> estadosRespuesta = new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
        for (int i = 0; i < estados.size(); i++) {
            if(estados.get(i).getPais().getId() == id){
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
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
    public Estado getOne(Long aLong) {
        return null;
    }

    @Override
    public Estado getById(Long aLong) {
        return null;
    }

    @Override
    public Estado getReferenceById(Long aLong) {
        return null;
    }


    @Override
    public List findAll(Example example, Sort sort) {
        return List.of();
    }

    @Override
    public List findAll(Example example) {
        return List.of();
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
    public <S extends Estado> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Estado> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List findAll() {
        return estadoRepository.findAll();
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
    public void delete(Estado entity) {

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
        return estadoRepository.findAll(sort);
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
