package com.usher.service;

import com.usher.model.SysDept;
import com.usher.param.DeptParam;

/**
 * @Author: Usher
 * @Description:
 */
public interface SysDeptService {
    void save(DeptParam param);

    void update(DeptParam param);

    void updateWithChild(SysDept before, SysDept after);

    boolean checkExist(Integer parentId, String deptName, Integer deptId);

    String getLevel(Integer deptId);

    void delete(int deptId);

}
