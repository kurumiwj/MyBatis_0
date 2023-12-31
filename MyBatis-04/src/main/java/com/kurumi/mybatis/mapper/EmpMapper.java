package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.Emp;
import com.kurumi.mybatis.entity.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int deleteByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int insert(Emp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int insertSelective(Emp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    Emp selectByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByExampleSelective(@Param("row") Emp row, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByExample(@Param("row") Emp row, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByPrimaryKeySelective(Emp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbg.generated Wed Mar 29 17:48:50 GMT+08:00 2023
     */
    int updateByPrimaryKey(Emp row);
}