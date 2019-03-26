package ka.shibun.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan("ka.shibun.springboot.mapper")
public class SpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class);
    }
}