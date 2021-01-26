package me.zhengjie.retrofit.api;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@RetrofitClient(baseUrl = "${test.baseUrl}")
public interface AliApi {
    @GET("users/{user}/repos")
    Call<Response> listRepos(@Path("user") String user);
}
