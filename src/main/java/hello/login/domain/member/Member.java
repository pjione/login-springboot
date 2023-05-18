package hello.login.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class Member {
    private Long id;
    @NotBlank
    private String loginId;
    @NotBlank
    private String name;
    @NotBlank
    private String password;

}
