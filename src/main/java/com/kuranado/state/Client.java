package com.kuranado.state;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-24 09:31
 */
public class Client {

    public static void main(String[] args) {
        VoteContext voteContext = new VoteContext();
        for (int i = 0; i < 8; i++) {
            voteContext.vote("小李", "3 号小朋友");
        }
    }
}
