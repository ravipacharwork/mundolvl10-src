/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.pm.ComponentInfo
 *  android.content.pm.ResolveInfo
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function4
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import top.bienvenido.date_24323.d2;
import top.bienvenido.date_24323.e5;
import top.bienvenido.date_24323.p0;
import top.bienvenido.date_24323.\u6211\u4ed6\u5988\u628a\u4f60\u585e\u8fdb\u4f60\u5a4a\u5b50\u5988\u7684\u5b50\u5bab\u91cc\u518d\u627e\u51e0\u6839\u673a\u5427\u7ed9\u4f60\u6405\u5408\u6405\u5408\u8ba9\u4f60\u8fd9\u4e2a\u6742\u79cd\u6d85\u69c3\u91cd\u751f;

public abstract class x8
extends d2 {
    public static final ResolveInfo \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(x8 x82, Object object, Object[] object2, p0 p02) {
        x82 = x82.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403();
        Object object3 = object2[1];
        object3 = object3 != null ? object3.toString() : null;
        object2 = object2[2];
        object2 = object2 instanceof Number ? ((Number)object2).intValue() : 0;
        return (ResolveInfo)x82.invoke(p02, object, object3, object2);
    }

    public abstract Function4 \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403();

    public abstract Function1 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Object object, Method method, Object[] objectArray) {
        Object object2;
        block5: {
            Object object3;
            Method method2;
            try {
                object2 = objectArray[0];
                object2 = object2 instanceof Intent ? (ResolveInfo)e5.\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(arg_0 -> x8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(this, object2, objectArray, arg_0)) : null;
                if (object2 != null) break block5;
                method2 = method;
                object3 = object;
                d2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(objectArray, 2);
            }
            catch (Exception exception) {
                return null;
            }
            object2 = (ResolveInfo)method2.invoke(object3, objectArray);
        }
        if (object2 == null) return null;
        \u6211\u4ed6\u5988\u628a\u4f60\u585e\u8fdb\u4f60\u5a4a\u5b50\u5988\u7684\u5b50\u5bab\u91cc\u518d\u627e\u51e0\u6839\u673a\u5427\u7ed9\u4f60\u6405\u5408\u6405\u5408\u8ba9\u4f60\u8fd9\u4e2a\u6742\u79cd\u6d85\u69c3\u91cd\u751f.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(((ComponentInfo)this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070().invoke((Object)object2)).applicationInfo);
        return object2;
    }
}

