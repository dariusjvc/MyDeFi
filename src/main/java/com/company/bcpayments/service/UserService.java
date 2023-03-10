package com.company.bcpayments.service;

import com.company.bcpayments.repository.RewardTokenRepository;
import com.company.bcpayments.repository.StakingTokenRepository;
import com.company.bcpayments.repository.MainTokenRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

@Service
@Primary
@Slf4j
public class UserService {

    private final StakingTokenRepository StakingToken;
    private final RewardTokenRepository rewardToken;
    private final MainTokenRepository mainTokenRepository;

    public UserService(StakingTokenRepository stakingToken, RewardTokenRepository rewardToken, MainTokenRepository mainTokenRepository) {
        StakingToken = stakingToken;
        this.rewardToken = rewardToken;
        this.mainTokenRepository = mainTokenRepository;
    }


    public TransactionReceipt approveStaking(double value) throws Exception {
        return StakingToken.approveStaking(  value);
    }



    public TransactionReceipt stakeTokens(double value) throws Exception {
        return mainTokenRepository.stakeTokens(  value);
    }



    public TransactionReceipt unstakeTokens() throws Exception {
        return mainTokenRepository.unstakeTokens( );
    }



    public String getTotalStakingTokensUser() throws Exception {
        return StakingToken.getTotalStakingTokensUser( );
    }


    public String getTotalRewardTokensUser() throws Exception {
        return rewardToken.getTotalRewardTokensUser( );
    }
}
