package main.java.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayBasedInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");

        if (dateFormat.format(date).equals("Sunday")) {
            response.getWriter().write("Sorry the site isn't available at the moment. Try again in 10 minutes. Thank you for understanding.");
            return false;
        } else {
            return true;
        }
    }
}
