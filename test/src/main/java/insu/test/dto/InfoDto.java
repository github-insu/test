package insu.test.dto;

// info html 에서 form 태그에 작성한 데이터를 나르기 위한 객체
public class InfoDto {

    //각 변수 선언
    private String id;
    private String pw;
    private String email;
    private String phone_number;

    //각 변수에 대한 생성자 선언 --> DTO에 담아 보내는 각각의 변수들을 하나로 객체화
    public InfoDto(String id, String pw, String email, String phone_number) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.phone_number = phone_number;
    }

    //toString() 코드 --> JSON 양식처럼 출력하게 하는 코드
    //Override는 왜 하는거야?

    @Override
    public String toString() {
        return "InfoDto{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
