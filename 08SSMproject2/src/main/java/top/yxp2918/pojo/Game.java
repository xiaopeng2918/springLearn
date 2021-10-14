package top.yxp2918.pojo;

/**
 * @author yxp2918
 * @date 2021-10-13-22:58
 */
public class Game {
    private int id;
    private String name;
    private String alias;

    public Game() {
    }

    public Game(int id, String name, String alias) {
        this.id = id;
        this.name = name;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
