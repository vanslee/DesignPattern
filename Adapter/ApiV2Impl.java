package Adapter;

public class ApiV2Impl implements ApiV2 {

    @Override
    public UserInfo getUserDetails(String userId, String authToken, boolean includeProfile) {
        if (includeProfile) {
            return new UserInfo(userId, userId, authToken);
        } else {
            // 模拟实际业务逻辑
            return new UserInfo(userId, "User-" + userId, userId + "@example.com");
        }
    }

}
