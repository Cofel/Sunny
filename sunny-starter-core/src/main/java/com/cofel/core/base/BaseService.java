package com.cofel.core.base;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 所有的Service集成本类可以获得一些基本方法
 */
public class BaseService<T> implements Service<T> {

    @Autowired
    private Mapper<T> mapper;

    private Class<T> entityClass;

    @SuppressWarnings("unchecked")
    @PostConstruct
    public void init(){
//        this.entityClass = Reflections
    }




    @Override
    public T insert(T record) {
        return null;
    }

    @Override
    public List<T> insert(List<T> recordList) {
        return null;
    }

    @Override
    public T insertSelective(T record) {
        return null;
    }

    @Override
    public List<T> insertSelective(List<T> recordList) {
        return null;
    }

    @Override
    public T update(T record) {
        return null;
    }

    @Override
    public List<T> update(List<T> recordList) {
        return null;
    }

    @Override
    public T updateSelective(T record) {
        return null;
    }

    @Override
    public List<T> updateSelective(List<T> recordList) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int delete(String ids) {
        return 0;
    }

    @Override
    public int delete(Long[] ids) {
        return 0;
    }

    @Override
    public int delete(T record) {
        return 0;
    }

    @Override
    public int delete(List<T> recordList) {
        return 0;
    }

    @Override
    public T persite(T record) {
        return null;
    }

    @Override
    public List<T> persite(List<T> recordList) {
        return null;
    }

    @Override
    public T persiteSelective(T record) {
        return null;
    }

    @Override
    public List<T> persiteSelective(List<T> recordList) {
        return null;
    }

    @Override
    public T get(Long id) {
        return null;
    }

    @Override
    public T get(T record) {
        return null;
    }

    @Override
    public T get(String key, Object value) {
        return null;
    }

    @Override
    public List<T> select(String ids) {
        return null;
    }

    @Override
    public List<T> select(T record) {
        return null;
    }

    @Override
    public List<T> select(String key, Object value) {
        return null;
    }

    @Override
    public List<T> select(T record, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<T> selectAll() {
        return null;
    }

    @Override
    public int count(T record) {
        return 0;
    }
}
