package ex2.router;

import ex2.view.AccountView;
import ex2.view.CreateAccountView;
import ex2.view.HomeView;
import ex2.view.View;
import lombok.Getter;


public enum Routes {
    HOME(new HomeView()), ACCOUNT(new AccountView()),CREATE_ACCOUNT(new CreateAccountView()), DEPOSIT(null), WITHDRAWAL(null);

    @Getter
    private View view;
    Routes(View view){
        this.view = view;
    }
}
