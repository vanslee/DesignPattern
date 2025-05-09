package Struct.Adapter;

public class Application {
    public static void main(String[] args) {
        // 客户端仍使用 V1 接口（无需感知 V2 的存在）
        ApiV1 apiV1 = new ApiV1ToV2Adapter(new ApiV2Impl());

        // 调用 V1 的方法（实际由适配器转发到 V2）
        String result = apiV1.getUserInfo("123", "token-xyz");
        System.out.println("客户端收到结果: " + result);
    }
}
