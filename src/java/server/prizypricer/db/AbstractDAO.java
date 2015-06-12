package server.prizypricer.db;

import server.prizypricer.domain.BusinessDomain;

import java.util.List;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
public abstract class AbstractDAO<T extends BusinessDomain> {

    public Integer save(T entity) {
        return null;
    }

    public boolean update(T entity) {
        return false;
    }

    public boolean delete(Integer entityId) {
        return false;
    }

    public T findById(Integer entityId) {
        return null;
    }

    public List<T> findAll() {
        return null;
    }

}
