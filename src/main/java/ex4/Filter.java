package ex4;

public interface Filter {
    void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain);

}
