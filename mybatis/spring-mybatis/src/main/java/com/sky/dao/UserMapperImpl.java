package com.sky.dao;

import com.sky.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * @author sky
 * @create 2021-05-29-17:08
 * @describe
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{


    @Override
    public User queryUserById(int id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.queryUserById(3);
    }
}

//public class UserDaoImpl implements UserMapper {
//
//    //sqlSession不用我们自己创建了，Spring来管理
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }
//
//    public List<User> selectUser() {
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.selectUser();
//    }
//
//}