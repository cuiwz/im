package com.cuiwz.mapper;

import com.cuiwz.pojo.Users;
import com.cuiwz.pojo.vo.FriendRequestVO;
import com.cuiwz.pojo.vo.MyFriendsVO;
import com.cuiwz.utils.MyMapper;

import java.util.List;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}