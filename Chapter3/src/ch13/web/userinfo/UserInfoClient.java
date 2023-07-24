package Chapter3.src.ch13.web.userinfo;

import Chapter3.src.ch13.domain.userinfo.UserInfo;
import Chapter3.src.ch13.domain.userinfo.dao.UserInfoDao;
import Chapter3.src.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Chapter3.src.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Chapter3/src/ch13/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();

        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("Lee");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
