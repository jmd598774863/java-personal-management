package jmd.dao;

import java.util.List;
import jmd.po.TaskType;
import jmd.po.TaskTypeExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    @Delete({
            "delete from task_type",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    @Insert({
            "insert into task_type (id, name, ",
            "color)",
            "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
            "#{color,jdbcType=VARCHAR})"
    })
    int insert(TaskType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    int insertSelective(TaskType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    List<TaskType> selectByExample(TaskTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    @Select({
            "select",
            "id, name, color",
            "from task_type",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("jmd.dao.TaskTypeMapper.BaseResultMap")
    TaskType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_type
     *
     * @mbg.generated
     */
    @Update({
            "update task_type",
            "set name = #{name,jdbcType=VARCHAR},",
            "color = #{color,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TaskType record);
}