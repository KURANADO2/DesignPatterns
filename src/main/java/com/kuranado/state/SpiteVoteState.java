package com.kuranado.state;

/**
 * 状态-恶意投票
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-24 09:15
 */
public class SpiteVoteState implements VoteState {

    @Override
    public void vote(String username, String voteItem, VoteContext voteContext) {
        // 取消用户投票资格
        voteContext.getVoteMap().remove(username);
        System.out.println("用户：" + username + " 为：" + voteItem + "投票，用户已投票数：" + voteContext.getVoteCountMap().get(username) +
            "，属于恶意投票");
    }
}
