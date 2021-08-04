package training.dao;

import java.util.List;

import trainging.entities.Type;

public interface TypeDAO {

	public boolean insertType(Type type);
	public List<Type> getAllType();
	public Type getTypeById(int id);
	public int updateTypeById(Type type);
}
