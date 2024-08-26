package servlet1.service;



import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import servlet1.dao.MemberDAO;

public class MemberServiceImp implements MemberService {
   
   private MemberDAO memberDao;
   
   public MemberServiceImp() {
      String resource = "servlet1/config/mybatis-config.xml";
      InputStream inputStream;
      SqlSession session;
      try {
         inputStream = Resources.getResourceAsStream(resource);
         SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         session = sessionFactory.openSession(true);
         memberDao = session.getMapper(MemberDAO.class);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
