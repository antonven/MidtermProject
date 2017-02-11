package myapps.wycoco.com.midtermproject;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.os.AsyncTask;

import java.util.ArrayList;

import myapps.wycoco.com.midtermproject.Models.ArticlesModel;

/**
 * Created by dell on 2/11/2017.
 */

public class NewsLoader extends AsyncTaskLoader<ArrayList<ArticlesModel>>{

    private String mUrl;

    public NewsLoader(Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<ArticlesModel> loadInBackground() {
        if(mUrl == null)
        return null;

        ArrayList<ArticlesModel> articles = QueryUtility.fetchNewsData(mUrl);
        return articles;
    }
}
