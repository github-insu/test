package insu.test.repository;

import insu.test.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    // db 연동하는 코드..
    // JPA
    static public ArrayList<UserDTO> users;

    static {
        users = new ArrayList<>();
        users.add(new UserDTO("kang", "1234","1","123"));
        users.add(new UserDTO("park", "5687","2","456"));
        users.add(new UserDTO("shin", "74185","3","789"));
    }

    //INSERT
    public UserDTO insertUser(UserDTO user) {
        users.add(user);
        return user;
    }

    // SELECT ALL
    public List<UserDTO> getAllUsers() {
        return users;
    }

    // FILTER
    public UserDTO getUserByUserId(String userID) {
        return users.stream()
                .filter(userDTO -> userDTO.getUserId().equals(userID))
                .findAny()
                .orElse(new UserDTO("","","",""));
    }

    // UPDATE
    public void updateUserPw(String userID, UserDTO user){
        users.stream()
                .filter(userDTO -> userDTO.getUserId().equals(userID))
                .findAny()
                .orElse(new UserDTO("","","",""))
                .setUserPw(user.getUserPw());
    }

    // Delete

    public void deleteUser(String userId) {
        users.removeIf(userDTO -> userDTO.getUserId().equals(userId));
    }
}
