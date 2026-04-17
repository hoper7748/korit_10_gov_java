package ex4;

public class EncodingFilter implements Filter{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("Encoding");
        filterChain.doFilter(request, response);
    }
}
