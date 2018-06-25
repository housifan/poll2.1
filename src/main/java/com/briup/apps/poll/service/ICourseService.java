package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface ICourseService {
List<Course> query(String keywords)throws Exception;
List<Course> findAll() throws Exception;
void save(Course course);
void update(Course course);
void deleteById(long id)throws Exception;
void batchDelete(List<Long> ids)throws Exception;
}
