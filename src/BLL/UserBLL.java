package BLL;

import DAL.UserDAL;
import DTO.UserDTO;
public class UserBLL {
    private UserDAL userDaL;
    
    public UserBLL(UserDAL userDal) {
        this.userDaL = userDal;
    }
    
    public boolean authenticate(String username, String password){
        UserDTO user = new UserDTO(username, password);
        return userDaL.authenticate(user);
    }
    
    public void addUser(UserDTO user) {
        userDaL.addUser(user);
    }
}