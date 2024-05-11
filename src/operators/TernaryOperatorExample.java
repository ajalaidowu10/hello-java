package operators;
public class TernaryOperatorExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;
        if(isAuthenticated)
            System.out.println("You are login");
        else
            System.out.println("You are not login");
        
            String result = (isAuthenticated) ? "LoggedIn" : "Not LoggedIn";
            System.out.println(result);
    }
}