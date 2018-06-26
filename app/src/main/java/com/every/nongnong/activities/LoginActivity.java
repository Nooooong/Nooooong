package com.every.nongnong.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.content.ContentValues;
import android.os.AsyncTask;
import android.widget.TextView;

import com.every.nongnong.R;
import com.every.nongnong.application.RequestHttpConnection;

/**
 * Created by Dongju on 2018. 6. 10..
 */

public class LoginActivity extends AppCompatActivity {

    // web_output 텍스트 뷰 선언
    public TextView HttpConnectionView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //--------------http URL의 결과값을 TextView로 출력 -----------------
        // web_output의 id를 참조 받아옴
        HttpConnectionView = (TextView) findViewById(R.id.web_output);
        // URL 설정
        String url = "http://172.30.1.23:55555/status";
        // AsyncTask를 통해 HttpURLConnection을 수행
        NetworkTask networkTask = new NetworkTask(url, null);
        networkTask.execute();
        //------------------------------------------------------------------


        Button button = findViewById(R.id.loginTest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginActivity.this ,LoginLogin01Activity.class);
                startActivity(intent);


            }
        });

    }
    public class NetworkTask extends AsyncTask<Void, Void, String> {

        private String url;
        private ContentValues values;

        public NetworkTask(String url, ContentValues values) {

            this.url = url;
            this.values = values;
        }

        @Override
        protected String doInBackground(Void... params) {

            String result; // 요청 결과를 저장할 변수.
            RequestHttpConnection requestHttpConnection = new RequestHttpConnection();
            result = requestHttpConnection.request(url, values); // 해당 URL로 부터 결과물을 얻어온다.

            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            //doInBackground()로 부터 리턴된 값이 onPostExecute()의 매개변수로 넘어오므로 s를 출력한다.
            HttpConnectionView.setText(s);
        }
    }

}
