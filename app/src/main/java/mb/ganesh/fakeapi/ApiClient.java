package mb.ganesh.fakeapi;

import androidx.core.content.ContextCompat;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit getRetrofit() {
        String api_base_url = "https://jsonplaceholder.typicode.com/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(api_base_url).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    public static UserService getUserService() {
        UserService userService = getRetrofit().create(UserService.class);
        return userService;
    }
}
