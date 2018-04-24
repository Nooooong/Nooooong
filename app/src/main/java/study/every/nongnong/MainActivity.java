package study.every.nongnong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        *
        * 목적 : 버튼을 눌려 팝업창을 띄워보쟈 .
        *
        * 2가지의 방법으로 사용하는 방법을 알아보쟈 .
        *
        *  1. Anonymous class , 즉 익명 클래스를 통한 구현 방법
        *  2. implements 를 통한 구현방법 .
        *
        *
        *  추가 사전 정보
        *  안드로이드의 xml 등을 통해 등록한 id 값들은 다  R.java 에 등록이 됩니다
        *  그래서 java 소스에서 xml의 id 값을 참조하려고 할 시
        *  findViewByid()함수를 사용하여 , R.id.{#xml의 쓴 Id 값}을 입력하면 됩니다
        *
        * */

        //Way 1 . Anonymous class , 즉 익명 클래스를 통한 구현 방법
        //
      Button button = (Button) findViewById(R.id.Anony);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Anonymous click",Toast.LENGTH_SHORT).show();
            }
        });


        //way 2 방법을 위한 리스너 등록
        findViewById(R.id.imps).setOnClickListener(this);

    }

    //Way 2  상단의 implements View.OnClickListener 를 구현하고 ,
    // onClick 메서드를 오버라이등 한 후 사용합니다
    @Override
    public void onClick(View v) {
        switch (v.getId()){ // view에 있는 아이디 값을 가져온다
            case R.id.imps:
                Toast.makeText(MainActivity.this,"Implement click",Toast.LENGTH_SHORT).show();
            break;
            // 만약에 여기서 모든 클릭 이벤트를 case 로 분기 한다고 치면
            /*
            * case R.id.Anony:
            *   // 아이디 값이 Anony 일때 로직 추가
            * break;
            *
            * */

        }

    }
}
