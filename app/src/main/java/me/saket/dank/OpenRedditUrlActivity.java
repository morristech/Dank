package me.saket.dank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import me.saket.dank.data.RedditUrl;
import me.saket.dank.ui.DankActivity;

public class OpenRedditUrlActivity extends DankActivity {

    private static final String KEY_REDDIT_LINK = "redditLink";

    public static void handle(Context context, RedditUrl redditUrl) {
        Intent intent = new Intent(context, OpenRedditUrlActivity.class);
        intent.putExtra(KEY_REDDIT_LINK, redditUrl);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RedditUrl redditUrl = getIntent().getParcelableExtra(KEY_REDDIT_LINK);
        Toast.makeText(this, redditUrl.toString(), Toast.LENGTH_SHORT).show();
        finish();
    }

}