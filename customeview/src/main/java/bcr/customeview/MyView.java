package bcr.customeview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Bekti on 14/10/2016.
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }

}