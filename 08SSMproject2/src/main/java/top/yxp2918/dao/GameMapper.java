package top.yxp2918.dao;

import top.yxp2918.pojo.Game;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-13-23:06
 */
public interface GameMapper {
    // 根据id查找一个游戏
    Game queryGameById(int id);
    // 根据id更新一个游戏
    int updateGameById(Game game);
    // 根据id删除一个游戏
    int deleteGameById(int id);
    // 增加一个游戏
    int addGame(Game game);
    // 查找全部游戏
    List<Game> queryAllGame();
}
