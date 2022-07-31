package paydemo.accountcore.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BootStrap.
 */
@SpringBootApplication(scanBasePackages = "paydemo")
@MapperScan(basePackages = "paydemo.accountcore.dao.mapper")
public class AccountCoreBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(AccountCoreBootStrap.class, args);
    }
}
