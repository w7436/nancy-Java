import nancy.dao.BlogMapper;
import nancy.pojo.Blog;
import nancy.utils.IDutils;
import nancy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 10:04
 * @Version 1.0
 **/

public class MyTest {

    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
//        ids.add(1);
//        ids.add(2);
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForEach(map);
        for(Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","中国2");
        map.put("id",1);
        List<Blog> blogs = mapper.queryBlogIF(map);
        for(Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId("1");
        blog.setAuthor("小绿");
        blog.setTitle("世界");
        blog.setViews("你好");
        blog.setCreateTime(new Date());
        int i = mapper.addBook(blog);
        if (i > 0) System.out.println("插入成功");
        sqlSession.close();
    }
}