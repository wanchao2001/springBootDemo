/**
 * 
 */
package com.dawnpro.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dawnpro.demo.entity.User;

/**
 * 
 * @UserDao.java   		@d2016年11月4日
 * All rights reserved.
 * <p>Title: @springBootDemo</p>
 * @author wanchao
 *
 */
@Mapper
public interface UserDao {

	 int save(User user);  
     
	    User selectById(Integer id);  
	      
	    int updateById(User user);  
	      
	    int deleteById(Integer id);  
	      
	    List<User> queryAll();  
}
