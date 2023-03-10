package com.company.bcpayments.wrapper;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class MainToken extends Contract {
    public static final String BINARY = "0x60806040526040518060400160405280600981526020017f4d61696e546f6b656e0000000000000000000000000000000000000000000000815250600090805190602001906200005192919062000150565b503480156200005f57600080fd5b506040516200142e3803806200142e8339818101604052810190620000859190620002c3565b81600360006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555080600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555033600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050506200036f565b8280546200015e9062000339565b90600052602060002090601f016020900481019282620001825760008555620001ce565b82601f106200019d57805160ff1916838001178555620001ce565b82800160010185558215620001ce579182015b82811115620001cd578251825591602001919060010190620001b0565b5b509050620001dd9190620001e1565b5090565b5b80821115620001fc576000816000905550600101620001e2565b5090565b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000620002328262000205565b9050919050565b6000620002468262000225565b9050919050565b620002588162000239565b81146200026457600080fd5b50565b60008151905062000278816200024d565b92915050565b60006200028b8262000225565b9050919050565b6200029d816200027e565b8114620002a957600080fd5b50565b600081519050620002bd8162000292565b92915050565b60008060408385031215620002dd57620002dc62000200565b5b6000620002ed8582860162000267565b92505060206200030085828601620002ac565b9150509250929050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600060028204905060018216806200035257607f821691505b602082108114156200036957620003686200030a565b5b50919050565b6110af806200037f6000396000f3fe608060405234801561001057600080fd5b50600436106100a95760003560e01c80637547c7a3116100715780637547c7a3146101545780638da5cb5b14610170578063a5ce413b1461018e578063c93c8f3414610198578063f7c618c1146101c8578063fd5e6dd1146101e6576100a9565b806306fdde03146100ae57806345bc78ab146100cc57806360ab5852146100fc5780636f49712b1461010657806372f702f314610136575b600080fd5b6100b6610216565b6040516100c39190610ac9565b60405180910390f35b6100e660048036038101906100e19190610b4e565b6102a4565b6040516100f39190610b94565b60405180910390f35b6101046102bc565b005b610120600480360381019061011b9190610b4e565b6104b5565b60405161012d9190610bca565b60405180910390f35b61013e6104d5565b60405161014b9190610c44565b60405180910390f35b61016e60048036038101906101699190610c8b565b6104fb565b005b6101786107ae565b6040516101859190610cc7565b60405180910390f35b6101966107d4565b005b6101b260048036038101906101ad9190610b4e565b6109ab565b6040516101bf9190610bca565b60405180910390f35b6101d06109cb565b6040516101dd9190610d03565b60405180910390f35b61020060048036038101906101fb9190610c8b565b6109f1565b60405161020d9190610cc7565b60405180910390f35b6000805461022390610d4d565b80601f016020809104026020016040519081016040528092919081815260200182805461024f90610d4d565b801561029c5780601f106102715761010080835404028352916020019161029c565b820191906000526020600020905b81548152906001019060200180831161027f57829003601f168201915b505050505081565b60056020528060005260406000206000915090505481565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461034c576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161034390610dcb565b60405180910390fd5b60005b6004805490508110156104b25760006004828154811061037257610371610deb565b5b9060005260206000200160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690506000600560008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050600081111561049d57600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a9059cbb83836040518363ffffffff1660e01b8152600401610449929190610e1a565b602060405180830381600087803b15801561046357600080fd5b505af1158015610477573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061049b9190610e6f565b505b505080806104aa90610ecb565b91505061034f565b50565b60076020528060005260406000206000915054906101000a900460ff1681565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000811161053e576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161053590610f60565b60405180910390fd5b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166323b872dd3330846040518463ffffffff1660e01b815260040161059d93929190610f80565b602060405180830381600087803b1580156105b757600080fd5b505af11580156105cb573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906105ef9190610e6f565b5080600560003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825461063f9190610fb7565b92505081905550600660003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff166106fb576004339080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b6001600760003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055506001600660003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555050565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000600560003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205490506000811161085b576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161085290611059565b60405180910390fd5b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a9059cbb33836040518363ffffffff1660e01b81526004016108b8929190610e1a565b602060405180830381600087803b1580156108d257600080fd5b505af11580156108e6573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061090a9190610e6f565b506000600560003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055506000600760003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555050565b60066020528060005260406000206000915054906101000a900460ff1681565b600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60048181548110610a0157600080fd5b906000526020600020016000915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600081519050919050565b600082825260208201905092915050565b60005b83811015610a6a578082015181840152602081019050610a4f565b83811115610a79576000848401525b50505050565b6000601f19601f8301169050919050565b6000610a9b82610a30565b610aa58185610a3b565b9350610ab5818560208601610a4c565b610abe81610a7f565b840191505092915050565b60006020820190508181036000830152610ae38184610a90565b905092915050565b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000610b1b82610af0565b9050919050565b610b2b81610b10565b8114610b3657600080fd5b50565b600081359050610b4881610b22565b92915050565b600060208284031215610b6457610b63610aeb565b5b6000610b7284828501610b39565b91505092915050565b6000819050919050565b610b8e81610b7b565b82525050565b6000602082019050610ba96000830184610b85565b92915050565b60008115159050919050565b610bc481610baf565b82525050565b6000602082019050610bdf6000830184610bbb565b92915050565b6000819050919050565b6000610c0a610c05610c0084610af0565b610be5565b610af0565b9050919050565b6000610c1c82610bef565b9050919050565b6000610c2e82610c11565b9050919050565b610c3e81610c23565b82525050565b6000602082019050610c596000830184610c35565b92915050565b610c6881610b7b565b8114610c7357600080fd5b50565b600081359050610c8581610c5f565b92915050565b600060208284031215610ca157610ca0610aeb565b5b6000610caf84828501610c76565b91505092915050565b610cc181610b10565b82525050565b6000602082019050610cdc6000830184610cb8565b92915050565b6000610ced82610c11565b9050919050565b610cfd81610ce2565b82525050565b6000602082019050610d186000830184610cf4565b92915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006002820490506001821680610d6557607f821691505b60208210811415610d7957610d78610d1e565b5b50919050565b7f596f7520617265206e6f74207468652061646d696e0000000000000000000000600082015250565b6000610db5601583610a3b565b9150610dc082610d7f565b602082019050919050565b60006020820190508181036000830152610de481610da8565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6000604082019050610e2f6000830185610cb8565b610e3c6020830184610b85565b9392505050565b610e4c81610baf565b8114610e5757600080fd5b50565b600081519050610e6981610e43565b92915050565b600060208284031215610e8557610e84610aeb565b5b6000610e9384828501610e5a565b91505092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610ed682610b7b565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff821415610f0957610f08610e9c565b5b600182019050919050565b7f54686520616d6f756e74206d757374206265206d6f7265207468616e20300000600082015250565b6000610f4a601e83610a3b565b9150610f5582610f14565b602082019050919050565b60006020820190508181036000830152610f7981610f3d565b9050919050565b6000606082019050610f956000830186610cb8565b610fa26020830185610cb8565b610faf6040830184610b85565b949350505050565b6000610fc282610b7b565b9150610fcd83610b7b565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561100257611001610e9c565b5b828201905092915050565b7f5468652062616c616e6365206d757374206265206d6f72652074686120300000600082015250565b6000611043601e83610a3b565b915061104e8261100d565b602082019050919050565b6000602082019050818103600083015261107281611036565b905091905056fea26469706673582212209eedacad3c7b4083b87c300e99896c2a2cb07ac11d953eecc002be53518767ec64736f6c63430008090033";

    public static final String FUNC_HASSTAKED = "hasStaked";

    public static final String FUNC_ISSTAKING = "isStaking";

    public static final String FUNC_ISSUETOKENS = "issueTokens";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_REWARDTOKEN = "rewardToken";

    public static final String FUNC_STAKETOKENS = "stakeTokens";

    public static final String FUNC_STAKERS = "stakers";

    public static final String FUNC_STAKINGBALANCE = "stakingBalance";

    public static final String FUNC_STAKINGTOKEN = "stakingToken";

    public static final String FUNC_UNSTAKETOKENS = "unstakeTokens";

    @Deprecated
    protected MainToken(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected MainToken(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected MainToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected MainToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Boolean> hasStaked(String param0) {
        final Function function = new Function(FUNC_HASSTAKED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> isStaking(String param0) {
        final Function function = new Function(FUNC_ISSTAKING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> issueTokens() {
        final Function function = new Function(
                FUNC_ISSUETOKENS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> rewardToken() {
        final Function function = new Function(FUNC_REWARDTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> stakeTokens(BigInteger _amount) {
        final Function function = new Function(
                FUNC_STAKETOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> stakers(BigInteger param0) {
        final Function function = new Function(FUNC_STAKERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> stakingBalance(String param0) {
        final Function function = new Function(FUNC_STAKINGBALANCE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> stakingToken() {
        final Function function = new Function(FUNC_STAKINGTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> unstakeTokens() {
        final Function function = new Function(
                FUNC_UNSTAKETOKENS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static MainToken load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new MainToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static MainToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new MainToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static MainToken load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new MainToken(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MainToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new MainToken(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<MainToken> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _rewardToken, String _stakingToken) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _rewardToken), 
                new org.web3j.abi.datatypes.Address(160, _stakingToken)));
        return deployRemoteCall(MainToken.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<MainToken> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _rewardToken, String _stakingToken) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _rewardToken), 
                new org.web3j.abi.datatypes.Address(160, _stakingToken)));
        return deployRemoteCall(MainToken.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<MainToken> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _rewardToken, String _stakingToken) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _rewardToken), 
                new org.web3j.abi.datatypes.Address(160, _stakingToken)));
        return deployRemoteCall(MainToken.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<MainToken> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _rewardToken, String _stakingToken) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _rewardToken), 
                new org.web3j.abi.datatypes.Address(160, _stakingToken)));
        return deployRemoteCall(MainToken.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
