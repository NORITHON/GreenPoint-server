package com.greenpoint.server.auth.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
//    private String nickname;
//    private String contact;
    private boolean isRegistered;
}
