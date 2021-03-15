package com.kuranado.state;

/**
 * 投票状态接口
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-24 09:12
 */
public interface VoteState {

    void vote(String username, String voteItem, VoteContext voteContext);
}
