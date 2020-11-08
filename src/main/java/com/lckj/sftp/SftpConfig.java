package com.lckj.sftp;

import lombok.Data;

/**
 * @author linjingliang
 * @version v1.0
 * @date 2020/6/19 9:45
 */
@Data
public class SftpConfig {

    /**
     * 连接地址
     */
    private String hostname;
    /**
     * 端口号
     */
    private Integer port;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 协议， 值写sftp
     */
    private String protocol;
    /**
     * sftp服务器根路径
     */
    private String root;
    /**
     * session连接超时时间
     */
    private Integer sessionConnectTimeout;
    /**
     * channel连接超时时间
     */
    private Integer channelConnectedTimeout;
}
