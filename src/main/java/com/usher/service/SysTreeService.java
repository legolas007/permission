package com.usher.service;

import com.google.common.collect.Multimap;
import com.usher.dto.AclDto;
import com.usher.dto.AclModuleLevelDto;
import com.usher.dto.DeptLevelDto;

import java.util.List;

/**
 * @Author: Usher
 * @Description:
 */
public interface SysTreeService {

    List<AclModuleLevelDto> userAclTree(int userId);
    List<AclModuleLevelDto> roleTree(int roleId);
    List<AclModuleLevelDto> aclListToTree(List<AclDto> aclDtoList);
    void bindAclsWithOrder(List<AclModuleLevelDto> aclModuleLevelList, Multimap<Integer, AclDto> moduleIdAclMap);
    List<AclModuleLevelDto> aclModuleListToTree(List<AclModuleLevelDto> dtoList);
    void transformAclModuleTree(List<AclModuleLevelDto> dtoList, String level, Multimap<String, AclModuleLevelDto> levelAclModuleMap);
    List<DeptLevelDto> deptListToTree(List<DeptLevelDto> deptLevelList);
    void transformDeptTree(List<DeptLevelDto> deptLevelList, String level, Multimap<String, DeptLevelDto> levelDeptMap);

}
