package com.learn.sharding.jdbc.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("t_wechat_user")
public class WechatUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7325587704000719399L;

	private String openid;
	private String nickname;
	private String avatar;
	private Integer id;

	public Integer getId() { return id; }

	public void setId(Integer id) { this.id = id; }

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


}
