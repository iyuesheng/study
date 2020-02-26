package cn.iisheng.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.junit.Test;

/**
 * @author iisheng
 * @date 2019/12/09 16:39:45
 */
public class JasyptTest {

    @Test
    public void test() {
//        StringEncryptor  encryptor = new StandardPBEStringEncryptor();
//        String url = encryptor.encrypt("jdbc:mysql://47.97.192.116:3306/sell?characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2b8");
//        String name = encryptor.encrypt("你的数据库名");
//        String password = encryptor.encrypt("你的数据库密码");
//        System.out.println(url+"----------------");
//        System.out.println(name+"----------------");
//        System.out.println(password+"----------------");

        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
        String encryptedPassword = passwordEncryptor.encryptPassword("123456");
//        System.out.println(encryptedPassword);



        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");  // 加密的算法，这个算法是默认的
        config.setPassword("12345");   // 加密的密钥
        standardPBEStringEncryptor.setConfig(config);
        String plainText = "hello";
        String encryptedText = standardPBEStringEncryptor.encrypt(plainText);
        standardPBEStringEncryptor.decrypt("/A2gZbLev48RYqbJveZr0w==");

        System.out.println(encryptedText);
    }
}
