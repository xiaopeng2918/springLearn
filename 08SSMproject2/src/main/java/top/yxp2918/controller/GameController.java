package top.yxp2918.controller;

/**
 * @author yxp2918
 * @date 2021-10-13-23:38
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.yxp2918.pojo.Game;
import top.yxp2918.service.GameService;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-12-22:56
 */
@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    @Qualifier("GameServiceImpl")
    private GameService gameService;

    @RequestMapping("/allGame")
    public String list(Model model) {
//        System.out.println("哈哈哈");
        List<Game> list = gameService.queryAllGame();
        model.addAttribute("list", list);
        return "allGame";
//        return "test";
    }

    @RequestMapping("/toAddGame")
    public String toAddPaper() {
        return "addGame";
    }

    @RequestMapping("/addGame")
    public String addPaper(Game games) {
        System.out.println(games);
        gameService.addGame(games);
        return "redirect:/game/allGame";
    }

    @RequestMapping("/toUpdateGame")
    public String toUpdateBook(Model model, int id) {
        Game games = gameService.queryGameById(id);
        System.out.println(games);
        model.addAttribute("game",games );
        return "updateGame";
    }

    @RequestMapping("/updateGame")
    public String updateBook(Model model, Game game) {
        System.out.println(game);
        gameService.updateGameById(game);
//        Books books = gameService.queryBookById(book.getBookID());
//        model.addAttribute("books", books);
        return "redirect:/game/allGame";
    }

    @RequestMapping("/del/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        gameService.deleteGameById(id);
        return "redirect:/game/allGame";
    }
}