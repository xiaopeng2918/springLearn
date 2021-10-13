package top.yxp2918.dao;

import top.yxp2918.pojo.Books;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-12-22:43
 */
public interface BookMapper {

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
