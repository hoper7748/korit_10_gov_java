package ex4;

public class Tomcat {
    public static void main(String[] args) {
        System.out.println("오청들어옴");
        FilterChain filterChain = new FilterChain();
        ServletRequest request = new ServletRequest();
        ServletResponse response = new ServletResponse();

        filterChain.doFilter(request, response);
        System.out.println("최종응답");
    }
}
