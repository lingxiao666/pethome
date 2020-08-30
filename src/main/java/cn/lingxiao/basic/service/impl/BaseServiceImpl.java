package cn.lingxiao.basic.service.impl;

import cn.lingxiao.basic.mapper.BaseMapper;
import cn.lingxiao.basic.query.BaseQuery;
import cn.lingxiao.basic.service.IBaseService;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.mapper.DepartmentMapper;
import cn.lingxiao.org.query.DepartmentQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    private BaseMapper<T> mapper;

    @Transactional
    @Override
    public void add(T d) {
        mapper.save(d);

    }

    @Transactional
    @Override
    public void delete(Long id) {
        mapper.remove(id);
    }

    @Transactional
    @Override
    public void update(T t) {
        mapper.update(t);
    }

    @Override
    public T findById(Long id) {

        return mapper.loadById(id);
    }

    @Override
    public List<T> findAll() {
        return mapper.loadAll();
    }


    @Override
    public PageList<T> queryData(BaseQuery query) {
        Long total = mapper.queryCount(query);
        if (total != 0) {
            List<T> data = mapper.queryData(query);
            return new PageList<>(total, data);

        } else {
            return new PageList<>();
        }
    }

    /*批量删除*/
    @Override
    @Transactional
    public void bulkDelete(List<Long> ids) {
        mapper.bulkRemove(ids);
    }
}
