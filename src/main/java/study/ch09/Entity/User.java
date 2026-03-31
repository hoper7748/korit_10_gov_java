package study.ch09.Entity;

public class User {
    private String username;
    private String password;
    private String name;

    public User(String username, String password, String name)
    {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public User(String username, String password)
    {
        this(username, password, "공백");
    }

    public User(String username)
    {
        this (username, "1234", "공백");
    }

    public void SetPassword(String password)
    {
        this.password = password;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public String GetName(){
        return name.substring(0, name.length() - 1);
    }

    public String GetUsername()
    {
        return username;
    }



    int max(int a, int b)
    {
        return a < b ? b : a;
    }

    int max(int a, int b, int c)
    {
        if(a > b && a > c)
            return a;
        if(b > a && b >c)
            return b;
        return c;
    }

    double max (double a, double b)
    {
        return a > b ? a : b;
    }

    String join(String a, String b)
    {
        return a + b ;
    }

    String join(String a , String b, String c )
    {
        return a + b + c;
    }

    String join(String[] arr)
    {
        String retS = "";
        for( String s : arr)
        {
            retS += s;
        }
        return retS;
    }


}
