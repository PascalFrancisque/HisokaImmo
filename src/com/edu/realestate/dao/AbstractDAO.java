package com.edu.realestate.dao;

public interface AbstractDAO<T> {

	void create(T t);

	T read(Integer id);

	void update(T t);

	void delete(Integer id);

}
