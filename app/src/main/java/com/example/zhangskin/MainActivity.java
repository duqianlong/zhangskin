package com.example.zhangskin;



import android.os.Bundle;
import android.view.View;

import com.zhy.changeskin.SkinManager;

public class MainActivity extends com.zhy.changeskin.base.BaseSkinActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        SkinManager.getInstance().init(this);

        //更改为夜间模式
        findViewById(R.id.mBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkinManager.getInstance().changeSkin("night");
            }
        });
        //恢复正常模式
        findViewById(R.id.mBtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkinManager.getInstance().removeAnySkin();
            }
        });
    }
}
