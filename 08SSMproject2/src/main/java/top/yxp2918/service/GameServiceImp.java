package top.yxp2918.service;

import top.yxp2918.dao.GameMapper;
import top.yxp2918.pojo.Game;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-13-23:26
 */
public class GameServiceImp implements GameService{
    private GameMapper gameMapper;

    public void setGameMapper(GameMapper gameMapper) {
        this.gameMapper = gameMapper;
    }

    @Override
    public Game queryGameById(int id) {
        return gameMapper.queryGameById(id);
    }

    @Override
    public int updateGameById(Game game) {
        return gameMapper.updateGameById(game);
    }

    @Override
    public int deleteGameById(int id) {
        return gameMapper.deleteGameById(id);
    }

    @Override
    public int addGame(Game game) {
        return gameMapper.addGame(game);
    }

    @Override
    public List<Game> queryAllGame() {
        return gameMapper.queryAllGame();
    }
}
