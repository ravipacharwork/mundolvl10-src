/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;

public abstract class a1 {
    public static Intent \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Intent intent) {
        Intent intent2;
        Intent intent3 = intent2;
        intent2 = new Intent();
        if (intent != null) {
            intent3.putExtra("mundo_base_bundle", (Parcelable)intent);
        }
        if (iBinder != null) {
            Bundle bundle;
            Intent intent4 = intent3;
            intent = bundle;
            new Bundle().putBinder("mundo_base_string", iBinder);
            intent4.putExtras((Bundle)intent);
            return intent4;
        }
        return intent3;
    }

    public static IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, Intent intent2) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            if ((intent = (Intent)intent.getParcelableExtra("mundo_base_bundle")) != null) {
                try {
                    intent2.fillIn(intent, -1);
                }
                catch (Exception exception) {}
            }
            return bundle.getBinder("mundo_base_string");
        }
        return null;
    }
}

