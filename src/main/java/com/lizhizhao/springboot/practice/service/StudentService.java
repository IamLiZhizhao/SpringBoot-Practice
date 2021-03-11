package com.lizhizhao.springboot.practice.service;

import com.lizhizhao.springboot.practice.entity.StudentDO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@CacheConfig(cacheNames = "student")
@Repository
public interface StudentService {

	int add(StudentDO student);

    @CachePut(key = "#p0.sno")
    StudentDO update(StudentDO student);

    @CacheEvict(key = "#p0", allEntries = true)
    void deleteBysno(String sno);

    @Cacheable(key = "#p0")
    StudentDO queryStudentBySno(String sno);

}
