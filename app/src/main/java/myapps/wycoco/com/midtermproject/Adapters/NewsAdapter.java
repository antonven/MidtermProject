package myapps.wycoco.com.midtermproject.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import myapps.wycoco.com.midtermproject.Models.ArticlesModel;
import myapps.wycoco.com.midtermproject.R;

import static myapps.wycoco.com.midtermproject.R.id.newsLink;

/**
 * Created by dell on 2/11/2017.
 */



public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ArticlesModel> articles;

    public NewsAdapter(Context mContext, ArrayList<ArticlesModel> articles){
        this.mContext = mContext;
        this.articles = articles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Glide.with(mContext).load(articles.get(position).getUrlToImage()).into(holder.newsImage);
        holder.newsTitle.setText(articles.get(position).getTitle());
        holder.newsDescription.setText(articles.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView newsImage;
            private TextView newsTitle;
            private TextView newsDescription;
            private LinearLayout newsLink;

            public ViewHolder(final View itemView){
                super(itemView);
                newsImage = (ImageView) itemView.findViewById(R.id.newsImage);
                newsTitle = (TextView) itemView.findViewById(R.id.newsTitle);
                newsDescription = (TextView) itemView.findViewById(R.id.newsDescription);
                newsLink = (LinearLayout) itemView.findViewById(R.id.newsLink);

                newsLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri newsUri = Uri.parse(articles.get(getAdapterPosition()).getUrl());
                        Intent websiteIntent = new Intent(Intent.ACTION_VIEW,newsUri);
                        mContext.startActivity(websiteIntent);
                    }
                });

            }
        }

}
