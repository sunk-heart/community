package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author shkstart
 * @create 2022-07-19-21:39
 */
@Data
public class LoginTicket {
    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
