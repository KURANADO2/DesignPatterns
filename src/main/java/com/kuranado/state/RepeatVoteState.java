package com.kuranado.state;

/**
 * 状态-重复投票
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-24 09:14
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String username, String voteItem, VoteContext voteContext) {
        // 仅提示用户，暂时不做处理
        System.out.println("用户：" + username + " 为：" + voteItem + "投票，用户已投票数：" + voteContext.getVoteCountMap().get(username) +
            "，属于重复投票");
    }
}
