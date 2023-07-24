package Chapter3.src.ch13.domain.userinfo.dao;

import Chapter3.src.ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);


}
