package cn.itsqh.ydma.dao;

import cn.itsqh.ydma.entity.LoginHistory;
import org.apache.ibatis.jdbc.SQL;

public class LoginHistorySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_history
     *
     * @mbg.generated Tue Jul 16 22:23:55 CST 2019
     */
    public String insertSelective(LoginHistory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("login_history");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getLoginTime() != null) {
            sql.VALUES("login_time", "#{loginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_history
     *
     * @mbg.generated Tue Jul 16 22:23:55 CST 2019
     */
    public String updateByPrimaryKeySelective(LoginHistory record) {
        SQL sql = new SQL();
        sql.UPDATE("login_history");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getLoginTime() != null) {
            sql.SET("login_time = #{loginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}