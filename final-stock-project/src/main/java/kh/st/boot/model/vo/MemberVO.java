package kh.st.boot.model.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {

	private int mb_no; //(11자리), auto_incre
    private String mb_id;
    private String mb_password;
    private String mb_name;
    private String mb_nick;
    private String mb_ph;
    private String mb_email;
    private int mb_zip; //(11자리)
    private String mb_addr;
    private String mb_addr2;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date mb_birth; //Date로 일단 변경
    private int mb_level; //(11자리)
    private Date mb_datetime;
    private Date mb_edit_date;
    private Date mb_stop_date;
    private Date mb_out_date;
    private String mb_cookie;
    private int mb_point; //(11자리)
    private byte mb_emailing; //이메일 수신동의 여부
    private String mb_account;
    private int mb_fail; 
    private Date mb_cookie_limit; // 쿠키 만료기간
    private boolean auto_login; // autoLogin, DB에는 없습니다. (re 가 on 일 경우 true 값이 들어옵니다.)
	public String getMb_auth() {
		String auth = "GUEST";
		int lev = this.mb_level;
		if(lev < 8) {
			auth = "USER";
		} else {
			auth = "ADMIN";
		}
		return auth;
	}
    
}