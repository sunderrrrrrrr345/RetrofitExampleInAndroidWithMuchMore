package sunder.com.khstm.retrofitexampleinandroidwithmuchmore.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sunder.com.khstm.retrofitexampleinandroidwithmuchmore.models.SOAnswersResponse;

/**
 * Created by Admin on 12/27/2017.
 */

public interface SOService {
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}
