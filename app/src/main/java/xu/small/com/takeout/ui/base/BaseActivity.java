package xu.small.com.takeout.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * author: senseLo
 * date: 2018/3/13
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        ButterKnife.bind(this);
    }

    public abstract int getLayoutId();


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
