package com.example.springproductes.Repositoris;

import com.example.springproductes.Entitats.Producte;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProducteDAO extends JpaRepository<Producte, Integer> {

    @Override
    public List<Producte> findAll();

    @Override
    public List<Producte> findAll(Sort sort);

    @Override
    default List<Producte> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default <S extends Producte> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default void flush() {

    }

    @Override
    default <S extends Producte> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Producte> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Producte> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Producte getOne(Integer integer) {
        return null;
    }

    @Override
    default Producte getById(Integer integer) {
        return null;
    }

    @Override
    default <S extends Producte> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Producte> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default Page<Producte> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Producte> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Producte> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(Producte entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends Producte> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default <S extends Producte> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Producte> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Producte> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Producte> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Producte, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
