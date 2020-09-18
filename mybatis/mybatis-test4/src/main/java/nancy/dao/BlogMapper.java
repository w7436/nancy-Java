/**
 * @ClassName BlogMapper
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 9:50
 * @Version 1.0
 **/
package nancy.dao;

import nancy.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBook(Blog blog);
    List<Blog> queryBlogIF(Map map);
    List<Blog> queryBlogChoose (Map map);
    int updateBlog(Map map);

    //查询博客
    List<Blog> queryBlogForEach(Map map);
}