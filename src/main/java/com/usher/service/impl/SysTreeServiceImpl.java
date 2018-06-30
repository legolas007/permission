package com.usher.service.impl;

import com.google.common.collect.Multimap;
import com.usher.dto.AclDto;
import com.usher.dto.AclModuleLevelDto;
import com.usher.dto.DeptLevelDto;
import com.usher.service.SysTreeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Usher
 * @Description:
 */
@Service
public class SysTreeServiceImpl implements SysTreeService {
    @Override
    public List<AclModuleLevelDto> userAclTree(int userId) {
        return null;
    }

    @Override
    public List<AclModuleLevelDto> roleTree(int roleId) {
        return null;
    }

    @Override
    public List<AclModuleLevelDto> aclListToTree(List<AclDto> aclDtoList) {
        return null;
    }

    @Override
    public void bindAclsWithOrder(List<AclModuleLevelDto> aclModuleLevelList, Multimap<Integer, AclDto> moduleIdAclMap) {

    }

    @Override
    public List<AclModuleLevelDto> aclModuleListToTree(List<AclModuleLevelDto> dtoList) {
        return null;
    }

    @Override
    public void transformAclModuleTree(List<AclModuleLevelDto> dtoList, String level, Multimap<String, AclModuleLevelDto> levelAclModuleMap) {

    }

    @Override
    public List<DeptLevelDto> deptListToTree(List<DeptLevelDto> deptLevelList) {
        return null;
    }

    @Override
    public void transformDeptTree(List<DeptLevelDto> deptLevelList, String level, Multimap<String, DeptLevelDto> levelDeptMap) {

    }
}
