/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  kotlin.Triple
 */
package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import kotlin.Triple;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.x3;
import top.bienvenido.mundo.manifest.MundoActivity$Companion$STUB;
import top.bienvenido.mundo.manifest.MundoReceiver;

public abstract class xxx\u70c2\u5f97\u8fc7\u4f60\u5988\u7684\u9a9a\u903c\u4e48 {
    public static Intent \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, int n10, x3 x32, boolean bl, String string) {
        Bundle bundle;
        ComponentName componentName;
        Intent intent2;
        String string2 = MundoActivity.Companion.STUB.class.getName() + n10;
        Intent intent3 = intent2;
        intent2 = new Intent();
        String string3 = b3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        if (bl) {
            string2 = string2 + "H";
        }
        ComponentName componentName2 = componentName;
        componentName2(string3, string2);
        string2 = intent3.setComponent(componentName2);
        intent3 = bundle;
        new Bundle().putParcelable("android.intent.extra.INTENT", (Parcelable)intent);
        intent3.putBinder(x3.class.getName(), (IBinder)x32);
        if (string != null) {
            intent3.putString(String.class.getName(), string);
        }
        Intent intent4 = intent3;
        intent4.putString("user", x32.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988);
        return string2.putExtras((Bundle)intent4).setType(String.valueOf(intent.filterHashCode()));
    }

    public static Intent \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, String string) {
        if (intent.getComponent() == null && intent.getPackage() == null) {
            return null;
        }
        String string2 = b3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        intent = new Intent(string2 + ".mundo.receiver.stub").setComponent(new ComponentName(string2, MundoReceiver.class.getName())).putExtra("android.intent.extra.INTENT", (Parcelable)intent);
        if (string != null) {
            Intent intent2 = intent;
            intent2.putExtra(String.class.getName(), string);
            return intent2;
        }
        return intent;
    }

    public static Triple \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent) {
        Triple triple;
        Intent intent2;
        block7: {
            block6: {
                try {
                    intent = intent.getExtras();
                    if (intent != null) break block6;
                    return null;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            Intent intent3 = intent;
            intent2 = (Intent)intent3.getParcelable("android.intent.extra.INTENT");
            if (intent2 != null) break block7;
            return null;
        }
        Triple triple2 = triple;
        Triple triple3 = triple2;
        Triple triple4 = triple2;
        Intent intent4 = intent2;
        Intent intent5 = intent;
        Intent intent6 = intent5;
        intent = intent5.getBinder(x3.class.getName());
        triple3((Object)intent4, (Object)intent, (Object)intent6.getString(String.class.getName()));
        return triple4;
    }
}

