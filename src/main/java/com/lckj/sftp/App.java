package com.lckj.sftp;

import java.io.File;

/**
 * @author linjingliang
 * @version v1.0
 * @date 2020/11/8
 */
public class App {

    public static void main(String[] args) {
        System.out.println("app start.");

        try {
            sftpTest();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void sftpTest() throws Exception {
        SftpConfig config = new SftpConfig();
        config.setHostname("securetransfer.generalmills.com");
        config.setUsername("FTP000593");
        config.setPassword("aRQimCN5H!r8((g");
        config.setPort(0);
        config.setProtocol("sftp");
        config.setRoot("/");
        config.setSessionConnectTimeout(300000);
        config.setChannelConnectedTimeout(30000);

        File file = new File("C:\\Users\\Linjl-PC\\Desktop\\logs\\test.txt");

        SftpService sftpService = new SftpService();
        sftpService.setStfpConfig(config);
        sftpService.createSftp();
        sftpService.uploadFile("/local/DRS/" + file.getName(), file);
        sftpService.disconnect();
    }
}
