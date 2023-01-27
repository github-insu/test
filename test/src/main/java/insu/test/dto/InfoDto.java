package insu.test.dto;

public class InfoDto {
    //form 태그에서 보내는 데이터를 각각 변수화
    private String id;
    private String pw;
    private String email;
    private String phone_number;


    // 각 변수들을 getter & setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
