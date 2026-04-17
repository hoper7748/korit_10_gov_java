package ex4;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = List.of(
            new EncodingFilter(),
            new SecurityFilter()
    );
    private int currentFilterIndex = 0;

    void doFilter(ServletRequest request, ServletResponse response) {
        if(currentFilterIndex == filters.size()){
            System.out.println("서블릿  호출");
            return;
        }
        filters.get(currentFilterIndex++).doFilter(request, response, this);
    }
}
