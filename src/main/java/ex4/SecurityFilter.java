package ex4;

public class SecurityFilter implements Filter{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("Security");
        filterChain.doFilter(request, response);
    }
}
