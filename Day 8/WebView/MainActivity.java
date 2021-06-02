package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    EditText etSearch;
    Button btnGo;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSearch=findViewById(R.id.etSearch);
        btnGo=findViewById(R.id.btnGo);
        webView=findViewById(R.id.webview);

        btnGo.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGo:

                String url = etSearch.getText().toString();

                webView.getSettings().setJavaScriptEnabled(true);

                webView.setWebViewClient(new MyWebViewClient());

                webView.loadUrl(url);

                break;
        }

    }

    private class MyWebViewClient extends WebViewClient{


        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //Use loadurl() method to load link in WebView.Return true.
            view.loadUrl(url);
            return true;
        }

    }

}