package Struct.Adapter;

public class ApiV1ToV2Adapter implements ApiV1 {
    private final ApiV2 apiV2;

    public ApiV1ToV2Adapter(ApiV2 apiV2) {
        this.apiV2 = apiV2;
    }

    @Override
    public String getUserInfo(String userId, String token) {
        // 转换逻辑：
        // 1. 将 V1 的简单参数转换为 V2 的复杂参数
        // 2. 调用 V2 的实际逻辑
        // 3. 将 V2 的复杂返回值转换为 V1 的简单返回值
        UserInfo userInfo = apiV2.getUserDetails(userId, token, true);
        return userInfo.toString(); // 简化处理，实际可能需格式化
    }

}
