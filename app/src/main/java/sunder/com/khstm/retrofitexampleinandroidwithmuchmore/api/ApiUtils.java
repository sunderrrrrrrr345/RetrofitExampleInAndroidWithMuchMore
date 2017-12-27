package sunder.com.khstm.retrofitexampleinandroidwithmuchmore.api;

import sunder.com.khstm.retrofitexampleinandroidwithmuchmore.retrofit.RetrofitClient;

/**
 * Created by Admin on 12/27/2017.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
