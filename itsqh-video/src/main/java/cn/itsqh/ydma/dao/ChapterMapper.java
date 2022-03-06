package cn.itsqh.ydma.dao;

import cn.itsqh.ydma.entity.Chapter;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    @Delete({
        "delete from chapter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    @Insert({
        "insert into chapter (name, course_id)",
        "values (#{name,jdbcType=VARCHAR}, #{courseId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    @InsertProvider(type=ChapterSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    @Select({
        "select",
        "id, name, course_id",
        "from chapter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER)
    })
    Chapter selectByPrimaryKey(Integer id);
    
    /**
     * 	根据课程ID查询章节和对应的视频
     * @param id 课程(course)ID
     * @return 章节和对应的视频
     */
    @Select({
        "select",
        "id, name, course_id",
        "from chapter",
        "where course_id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(column="id",property="videos",many=@Many(select="cn.itsqh.ydma.dao.VideoMapper.selectByChapterId"))
    })
    List<Chapter> selectByCourseId(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    @UpdateProvider(type=ChapterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    @Update({
        "update chapter",
        "set name = #{name,jdbcType=VARCHAR},",
          "course_id = #{courseId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Chapter record);
}