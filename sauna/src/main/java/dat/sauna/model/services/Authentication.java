package dat.sauna.model.services;

import dat.sauna.model.entities.User;

import javax.servlet.http.HttpServletRequest;

public class Authentication
{
    public static boolean isRoleAllowed(String role, HttpServletRequest request)
    {
        // Todo: extract user object from session scope and check role
        User user = (User) request.getSession().getAttribute("user");

        if(user != null) {
            if(user.getRole().equals(role)) {
                return true;
            }
        }
        return false;
    }
}
