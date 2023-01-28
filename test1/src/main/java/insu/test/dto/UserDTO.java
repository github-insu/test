package insu.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    //form 태그에서 보내는 데이터를 각각 변수화
    private String userId;
    private String userPw;
    private String userEmail;
    private String userPhonenumber;
}
