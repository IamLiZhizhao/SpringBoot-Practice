package com.lizhizhao.springboot.practice.mapper;

import com.lizhizhao.springboot.practice.entity.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SysLogMapper {

	@Insert("insert into sys_log (id,username,operation,time,method,params,ip,create_time) " +
			"values(#{id},#{username},#{operation},#{time},#{method},#{params},#{ip},#{createTime})")
	void saveSysLog(SysLog syslog);

}
