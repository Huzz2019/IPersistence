package com.huzz.sqlSession;

import java.util.List;

public interface SqlSession {

    //查询所有
    public <E> List<E> selectList(String statementid, Object... params) throws Exception;

    //根据条件查询单个
    public <T> T selectOne(String statementid, Object... params) throws Exception;

    //插入一条数据
    public int insertOne(String statementid, Object... params) throws Exception;

    //修改一条数据
    public int updateOne(String statementid, Object... params) throws Exception;

    //删除一条数据
    public int deleteOne(String statementid, Object... params) throws Exception;

    //为Dao接口生成代理实现类
    public <T> T getMapper(Class<?> mapperClass);


}
