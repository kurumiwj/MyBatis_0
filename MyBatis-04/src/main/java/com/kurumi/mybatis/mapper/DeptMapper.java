package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.Dept;
import com.kurumi.mybatis.entity.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    long countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int insert(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int insertSelective(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    Dept selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByExampleSelective(@Param("row") Dept row, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByExample(@Param("row") Dept row, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByPrimaryKeySelective(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByPrimaryKey(Dept row);
}