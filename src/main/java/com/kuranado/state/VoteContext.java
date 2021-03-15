package com.kuranado.state;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票上下文
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-24 09:17
 */
@Getter
public class VoteContext {

    /**
     * 投票状态接口
     */
    private VoteState voteState;

    /**
     * 保存用户投票结果 username-voteItem
     */
    private final Map<String, String> voteMap = new HashMap<>();

    /**
     * 保存用户投票数
     */
    private final Map<String, Integer> voteCountMap = new HashMap<>();

    /**
     * 投票方法
     * @param username 用户名
     * @param voteItem 用户所投的项目
     */
    public void vote(String username, String voteItem) {
        // 用户已投票数
        Integer voteCount = voteCountMap.get(username);
        if (voteCount == null) {
            voteCount = 0;
        }

        voteMap.put(username, voteItem);
        voteCount ++;
        voteCountMap.put(username, voteCount);

        // 正常投票
        if (voteCount == 1) {
            voteState = new NormalVoteState();
        } else if (voteCount > 1 && voteCount < 5) {
            // 重复投票
            voteState = new RepeatVoteState();
        } else if (voteCount >= 5 && voteCount < 8) {
            // 恶意投票
            voteState = new SpiteVoteState();
        } else if (voteCount >= 8) {
            // 拉入黑名单
            voteState = new BlackVoteState();
        }
        voteState.vote(username, voteItem, this);
    }
}
