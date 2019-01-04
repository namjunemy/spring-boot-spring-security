package namjune.io.security;

import namjune.io.security.domain.Account;
import namjune.io.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account nj = accountService.createAccount("nj", "1234");
        System.out.println(nj.getUsername() + ":" + nj.getPassword());
    }
}
