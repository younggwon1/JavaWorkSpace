package Chapter3.CH13.domain.userinfo.dao;

import Chapter3.CH13.domain.userinfo.UserInfo;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInf(UserInfo userInfo);
}