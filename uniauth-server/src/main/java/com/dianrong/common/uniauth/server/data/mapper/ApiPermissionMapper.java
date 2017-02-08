package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.ApiPermission;
import com.dianrong.common.uniauth.server.data.entity.ApiPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int countByExample(ApiPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int deleteByExample(ApiPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int insert(ApiPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int insertSelective(ApiPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    List<ApiPermission> selectByExample(ApiPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    ApiPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByExampleSelective(@Param("record") ApiPermission record, @Param("example") ApiPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByExample(@Param("record") ApiPermission record, @Param("example") ApiPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByPrimaryKeySelective(ApiPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_permission
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByPrimaryKey(ApiPermission record);
    
    
    List<ApiPermission> searchAllPrivatePermissions(Integer apiCallerId);
}