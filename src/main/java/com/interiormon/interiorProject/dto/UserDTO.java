package com.interiormon.interiorProject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserDTO {

    @NotBlank(message = "아이디를 입력하세요.")
    private String userId;

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "비밀번호는 8~16자의 영문, 숫자, 특수문자가 포함되어야 합니다.")
    private String password;

    private String password2;

    @NotBlank(message = "닉네임을 입력하세요.")
    private String nickname;

    @Pattern(regexp = "^01([0|1|6|7|8|9])?([0-9]{3,4})?([0-9]{4})$", message = "올바르지 않은 전화번호입니다.")
    private String phone;

    @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", message = "올바르지 않은 이메일입니다.")
    private String email;

}
