package com.usher.service.impl;

import com.usher.common.RequestHolder;
import com.usher.dao.SysDeptMapper;
import com.usher.dao.SysLogMapper;
import com.usher.dao.SysUserMapper;
import com.usher.exception.ParamException;
import com.usher.model.SysDept;
import com.usher.param.DeptParam;
import com.usher.service.SysDeptService;
import com.usher.util.BeanValidator;
import com.usher.util.LevelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: Usher
 * @Description:
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void save(DeptParam param) {
        BeanValidator.check(param);
        if (checkExist(param.getParentId(), param.getName(), param.getId())) {
            throw new ParamException("同一层级下存在相同名称的部门");
        }

        SysDept dept = SysDept.builder().name(param.getName()).parentId(param.getParentId()).seq(param.getSeq()).remark(param.getRemark()).build();
        dept.setLevel(LevelUtil.calculateLevel(getLevel(param.getParentId()), param.getParentId()));
        dept.setOperator(RequestHolder.getCurrentUser().getUsername());
        dept.setOperateIp(IpUtil.getRemoteIp(RequestHolder.getCurrentRequest()));
        dept.setOperateTime(new Date());
        sysDeptMapper.insertSelective(dept);
        sysLogService.saveDeptLog(null, dept);
    }

    @Override
    public void update(DeptParam param) {

    }

    @Override
    public void updateWithChild(SysDept before, SysDept after) {

    }

    @Override
    public boolean checkExist(Integer parentId, String deptName, Integer deptId) {
        return false;
    }

    @Override
    public String getLevel(Integer deptId) {
        return null;
    }

    @Override
    public void delete(int deptId) {

    }
}
