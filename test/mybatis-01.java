// InputStream is=Resource.getResourceAsStream("mybatis-config.xml");
// SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
// SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
// SqlSession sqlSession=sqlSessionFactory.openSession(true);
// Mapper mapper=sqlSession.getMapper(Mapper.class);

InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
SqlSession sqlSession=sqlSessionFactory.openSession(true);
Mapper mapper=sqlSession.getMapper(Mapper.class);