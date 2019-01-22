package hr.foi.watchme.WebServiceApi.WebServiceInterfaces;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface WatchMeWebService {

    @GET("api/korisnici/users/1")
    Call<String> getUsers();

    @GET("api/korisnici/users/provjeri/")
    Call<Void> getUserLogin();

    @GET("api/sadrzaj/sadrzaj/")
    Call<String> getMovies();

    @GET("api/sadrzaj/sadrzaj/{id}")
    Call<String> getMoviesByID(@Path("id") int id);

    @GET("api/sadrzaj/sadrzaj/dohvati_prema_kategoriji")
    Call<String> getCategories();

    @Headers("Content-Type: application/json")
    @POST("api/korisnici/users/provjeri/")
    Call<ResponseBody> postUserLogin(@Body String body);
}
