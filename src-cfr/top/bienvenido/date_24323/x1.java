/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  android.content.pm.ComponentInfo
 *  android.content.pm.PackageParser$IntentInfo
 *  android.content.pm.PackageParser$Provider
 *  android.content.pm.PackageParser$ProviderIntentInfo
 */
package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageParser;
import java.util.ArrayList;
import top.bienvenido.date_24323.b2;
import top.bienvenido.date_24323.v1;
import top.bienvenido.date_24323.w1;
import top.bienvenido.date_24323.y0;

public final class x1
extends y0 {
    public final /* synthetic */ b2 \u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988;

    public x1(b2 object, ArrayList object2) {
        this.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988 = object;
        object = object2.iterator();
        while (object.hasNext()) {
            object2 = (PackageParser.Provider)object.next();
            if (((PackageParser.Provider)object2).info == null || (object2 = ((PackageParser.Provider)object2).intents) == null) continue;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((IntentFilter)((PackageParser.ProviderIntentInfo)object2.next()));
            }
        }
    }

    @Override
    public final Object \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IntentFilter intentFilter, int n10, int n11) {
        x1 x12 = x13;
        x1 x13 = (PackageParser.ProviderIntentInfo)intentFilter;
        return b2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(x12.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988, (ComponentInfo)((PackageParser.ProviderIntentInfo)x13).provider.info, new v1((Object)w1.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070), (PackageParser.IntentInfo)x13, n11, n10);
    }

    @Override
    public final int \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(IntentFilter intentFilter) {
        return ((PackageParser.ProviderIntentInfo)intentFilter).provider.info.name.hashCode();
    }
}

