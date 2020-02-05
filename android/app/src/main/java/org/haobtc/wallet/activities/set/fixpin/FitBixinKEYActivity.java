package org.haobtc.wallet.activities.set.fixpin;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import org.haobtc.wallet.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FitBixinKEYActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit_bixin_key);
        ButterKnife.bind(this);

        mWhiteinitState();
    }

    @SuppressLint("ObsoleteSdkInt")
    private void mWhiteinitState() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            //透明导航栏

        }
    }

    @OnClick(R.id.img_back)
    public void onViewClicked(View view) {
        if (view.getId() == R.id.img_back) {
            finish();
        }
    }
}
