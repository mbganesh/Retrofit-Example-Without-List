package mb.ganesh.fakeapi;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("posts/1")
    Call<APIResponse> getData();
}
