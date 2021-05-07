package br.com.crinnnger.codeanywhere.SpringJWT.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserData implements Serializable {
    private String UserName;
    private String password;
}
