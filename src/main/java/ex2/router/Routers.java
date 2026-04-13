package ex2.router;

import ex2.view.AccountView;
import ex2.view.HomeView;
import ex2.view.View;
import lombok.Getter;


public enum Routers {
    HOME(new HomeView()), ACCOUNT(new AccountView()), DEPOSIT(null), WITHDRAWAL(null);

    @Getter
    private View view;
    Routers(View view){
        this.view = view;
    }
}
