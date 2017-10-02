package facade;

/**
 * 外观模式
 */
public class WebProject {

    private Tomcat tomcat;

    private Spring spring;

    private JdbcPool jdbcPool;

    public WebProject(){
        this.tomcat = new Tomcat();
        this.spring = new Spring();
        this.jdbcPool = new JdbcPool();
    }

    public void start(){
        tomcat.start();
        spring.start();
        jdbcPool.start();
    }

    public void stop(){
        jdbcPool.stop();
        spring.stop();
        tomcat.stop();
    }
}
