package cn.itsqh.ydma.dao;

import cn.itsqh.ydma.entity.Note;

import java.text.ParseException;

import org.apache.ibatis.jdbc.SQL;

public class NoteSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     * @throws ParseException 
     *
     * @mbg.generated Mon Jul 08 16:16:07 CST 2019
     */
    public String insertSelective(Note record) throws ParseException {
        SQL sql = new SQL();
        sql.INSERT_INTO("note");
        
        if (record.getPublishTime() != null) {
            sql.VALUES("publish_time", "#{publishTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLikeCount() != null) {
            sql.VALUES("like_count", "#{likeCount,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getVideoId() != null) {
            sql.VALUES("video_id", "#{videoId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            sql.VALUES("context", "#{context,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbg.generated Mon Jul 08 16:16:07 CST 2019
     */
    public String updateByPrimaryKeySelective(Note record) {
        SQL sql = new SQL();
        sql.UPDATE("note");
        
			if (record.getPublishTime() != null) {
			    sql.SET("publish_time = #{publishTime,jdbcType=TIMESTAMP}");
			}
        
        if (record.getLikeCount() != null) {
            sql.SET("like_count = #{likeCount,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getVideoId() != null) {
            sql.SET("video_id = #{videoId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            sql.SET("context = #{context,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}