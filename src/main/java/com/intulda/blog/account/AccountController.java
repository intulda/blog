package com.intulda.blog.account;

import com.intulda.blog.account.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/account/*")
public class AccountController {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping(value="save")
    public List<Account> saveAccount(Account account) {
        accountRepository.save(account);
        return accountRepository.findAll();
    }
}
