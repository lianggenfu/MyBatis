package com.etc.entity;

public class User {
    private Integer userid;

    private String nickname;

    private String userpwd;

    private String userphone;

    private String useremail;

    private Integer type;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public User() {
		// TODO Auto-generated constructor stub
	}

	public User( String nickname, String userpwd, String userphone,String email, Integer type) {
		super();		
		this.nickname = nickname;
		this.userpwd = userpwd;
		this.userphone = userphone;	
		this.useremail=email;
		this.type = type;
	}
	public User( String nickname, String userpwd, String userphone, String useremail) {
		super();		
		this.nickname = nickname;
		this.userpwd = userpwd;
		this.userphone = userphone;
		this.useremail = useremail;		
	}
    
}