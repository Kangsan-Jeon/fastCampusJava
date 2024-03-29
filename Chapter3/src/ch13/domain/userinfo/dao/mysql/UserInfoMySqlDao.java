package Chapter3.src.ch13.domain.userinfo.dao.mysql;

import Chapter3.src.ch13.domain.userinfo.UserInfo;
import Chapter3.src.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySql DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySql DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySql DB userID = " + userInfo.getUserId());
    }
}
