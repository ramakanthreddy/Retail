package com.javahome.app.assemblers;

import com.javahome.dao.entity.RoleEntity;
import com.javahome.web.vo.RoleVO;

public class RoleAssembler {
	
	public static RoleVO toRoleVO(RoleEntity roleEntity){
		
		RoleVO roleVO = new RoleVO();
		if(roleEntity != null){
			roleVO.setRoleId(roleEntity.getRoleId());
			roleVO.setRoleType(roleEntity.getRoleType());
		}
		return roleVO;
	}

}
