package ex3.router;

import ex3.controller.AccountController;
import ex3.view.AccountView;
import ex3.view.BankServiceView;
import ex3.view.MainView;
import ex3.view.View;
import lombok.Getter;

public enum Router {
    HOME(new MainView()), ACCOUNT(new AccountView()), DIPOSIT(new BankServiceView("입금")), WITHDRAW(new BankServiceView("출금"));

    @Getter
    View view;
    Router(View view){
        this.view = view;
    }
}
