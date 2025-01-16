package com.desert.android.library;

import android.content.Context;
import android.widget.Toast;

/**
 * @ClassName : EasyToast
 * @Author : zhouqiang(1376359644@qq.com)
 * @Email : newpos@newpostech.com
 * @Date : 2025/1/15-16:10
 * @Version : 1.0
 * @Description :
 * @website : <a href="https://www.newpostech.com/">...</a>
 */
public class EasyToast {
    /**
     * Toast
     */
    public static void show(final Context context, final CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * LongToast
     */
    public static void showLong(final Context context, final CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
