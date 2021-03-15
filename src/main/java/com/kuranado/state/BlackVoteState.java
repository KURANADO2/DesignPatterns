package com.kuranado.state;

/**
 * 状态-黑名单投票
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-24 09:16
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String username, String voteItem, VoteContext voteContext) {
        // 拉入黑名单
        System.out.println("用户：" + username + " 为：" + voteItem + "投票，用户已投票数：" + voteContext.getVoteCountMap().get(username) +
            "，拉入黑名单");
    }
}
