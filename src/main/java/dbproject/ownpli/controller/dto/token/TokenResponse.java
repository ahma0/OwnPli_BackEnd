package dbproject.ownpli.controller.dto.token;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TokenResponse {

    private final String atk;
    private final String rtk;

}
