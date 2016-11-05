/**
 * 
 */
package com.dawnpro.demo.entity;

/**
 * 
 * @User.java   		@d2016年11月4日
 * All rights reserved.
 * <p>Title: @springBootDemo</p>
 * @author wanchao
 *
 */
public class User {

	
	 private Integer id;  
     
	    private String userName;  
	      
	    private Integer age;

		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}

		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * @param userName the userName to set
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}

		/**
		 * @return the age
		 */
		public Integer getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(Integer age) {
			this.age = age;
		}  
	    
	    
}
