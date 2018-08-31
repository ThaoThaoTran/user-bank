package wit.userbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wit.userbank.dao.models.Bank;
import wit.userbank.dao.models.User;
import wit.userbank.services.UserBankServiceImpl;

import java.util.List;

@Controller
public class UserBankController {
    @Autowired
    private UserBankServiceImpl userBankService;

    @GetMapping(value = "/user")
    public @ResponseBody
    List<User> getUser() {
        return userBankService.listUser();
    }
    @GetMapping(value = "/bank")
    public @ResponseBody
    List<Bank> getBank() {
        return userBankService.listBank ();
    }

    @PostMapping(value = "/user")
    public @ResponseBody String createUser(@RequestBody User user){

        return userBankService.createUser(user);
    }

    @PostMapping(value = "/bank")
    public  @ResponseBody String createBank (@RequestBody Bank bank){
        return userBankService.createBank(bank);
    }

    @PutMapping(value = "/user")
    public @ResponseBody String putUser(@RequestBody User user){

        return userBankService.updateUser(user);
    }
    @PutMapping(value = "/user")
    public @ResponseBody String putBank(@RequestBody Bank bank){

        return userBankService.updateBank(bank);
    }
    @DeleteMapping(value = "/user/{id}")
    public @ResponseBody String daleteUser(@PathVariable(value = "id") long id){

        return userBankService.remote(id);
    }


    @DeleteMapping(value = "/bank/{id}")
    public @ResponseBody String daleteBabk(@PathVariable(value = "id") long id){

        return userBankService.remote(id);
    }


}