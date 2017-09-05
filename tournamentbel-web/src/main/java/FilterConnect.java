import javax.servlet.*;
import java.io.IOException;

/**
 * Created by USER on 05.09.2017.
 */
public class FilterConnect implements Filter {
    private FilterConfig config = null;
    private boolean active = false;
    public void destroy() {
            config = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (active)
        {
            System.out.println("Фильтр работает");
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
        String act = config.getInitParameter("active");
        if (act != null)
            active = (act.toUpperCase().equals("TRUE"));
    }

}
