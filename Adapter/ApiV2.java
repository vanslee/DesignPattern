package Adapter;

public interface ApiV2 {
    UserInfo getUserDetails(String userId, String authToken, boolean includeProfile);
}
