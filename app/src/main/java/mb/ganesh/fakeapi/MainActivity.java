package mb.ganesh.fakeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId);

        Call<APIResponse> call = ApiClient.getUserService().getData();
        call.enqueue(new Callback<APIResponse>() {

            @Override
            public void onResponse(Call<APIResponse> call, Response<APIResponse> response) {

                Log.d("response",response.body().getUserId() +"");
                Log.d("response",response.body().getId()+"");
                Log.d("response",response.body().getTitle());
                Log.d("response",response.body().getBody());

            }

            @Override
            public void onFailure(Call<APIResponse> call, Throwable t) {
                Log.d("error",t.getMessage());
            }
        });
    }
}