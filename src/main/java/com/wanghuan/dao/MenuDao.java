package com.wanghuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wanghuan.model.sys.MenuEntity;

@Mapper
public interface MenuDao {

	/**
	 * 通过用户Id得到一级菜单List
	 * @param id
	 * @return
	 */
	List<MenuEntity> getParentMenuListById(@Param("ids") String[] ids);
	
	List<MenuEntity> getMenuListById(@Param("ids") String[] ids);

	String getMenuIdByRole(@Param("id") int id);

}
